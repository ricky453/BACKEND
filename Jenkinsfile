  pipeline{
   agent any
   stages{
       stage('GetRepo'){
           steps{
               git'https://github.com/ricky453/BACKEND.git'
           }
       }
       stage('Unity TEST'){
           steps{
               sh'$MAVEN test'
           }
       }
       stage('SonarQube'){
           steps{
               sh"$MAVEN clean org.jacoco:jacoco-maven-plugin:prepare-agent install"
               sh"$MAVEN sonar:sonar -Dsonar.host.url=http://172.17.0.4:9000"
               
           }
       }
        stage('Build'){
           steps{
               sh'$MAVEN -B -DskipTests clean install'
           }
           
       }
   
   }
}
 
