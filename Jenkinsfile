pipeline {
    agent any
    stages {
        stage('Get github repo') {
            steps {
                git url: 'https://github.com/ricky453/BACKEND.git'
            }
        }
        stage('Unit Testing') {
            steps{
                sh'mvn test'
            }
        }
        stage('Build && SonarQube analysis') {
            steps {
                withSonarQubeEnv('sonarmantenimiento') {
                    // requires SonarQube Scanner for Maven 3.2+
                    sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.4.0.905:sonar -Dsonar.host.url=http://172.17.0.1:9000'
                }
            }
        }
        stage("Quality Gate") {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    // Parameter indicates whether to set pipeline to UNSTABLE if Quality Gate fails
                    // true = set pipeline to UNSTABLE, false = don't
                    // Requires SonarQube Scanner for Jenkins 2.7+
                    waitForQualityGate abortPipeline: true
                }
            }
        }
        stage('Build'){
            steps{
               sh'$MAVEN -B -DskipTests clean install'
            }
        }
        stage('Copy artifact'){
            steps{
                step([$class: 'ArtifactArchiver', artifacts: 'MantenimientoWeb-web/Mantenimiento-DC/PayaraMicro/*.war'])
            }
        }
        stage('Build Apache'){
            steps{
                script {
                    dir('MantenimientoWeb-web'){
                        sh 'cp target/MantenimientoWeb-web-1.0-SNAPSHOT.war Mantenimiento-DC/PayaraMicro'
                    }
                    echo "Build in server"
                    withDockerServer([uri:"tcp://172.17.0.1:2376"]) { s->
                            def app = docker.build('localhost:5000/paymitpi:latest', 'MantenimientoWeb-web/Mantenimiento-DC/PayaraMicro/.')
                        withDockerRegistry([url:'https://localhost:5000']) { r->
                                app.push('latest')
                        }
                    }
                }
            }
        }    
    }
}
 
