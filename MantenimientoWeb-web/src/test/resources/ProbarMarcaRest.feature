Feature: Probar Marca Rest
Probar el resource de la entidad Marca


#Scenario: Obtener una lista de marca 
#When tengo un nombre
#When tengo una ruta 
#Then obtengo un estado 200
#Then obtengo una lista de marcas:
#"""
#[{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":1,"marca":"HP"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":2,"marca":"LENOVO"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":3,"marca":"TOSHIBA"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":4,"marca":"SAMSUNG"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":5,"marca":"ACER"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":6,"marca":"DELL"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":7,"marca":"APPLE"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":8,"marca":"ASUS"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":9,"marca":"ALIENWARE"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":10,"marca":"GATEWAY"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":11,"marca":"LANIX"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":12,"marca":"VAIO"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":13,"marca":"SONY"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":14,"marca":"LG"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":15,"marca":"COMPAQ"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":16,"marca":"PANASONIC"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":17,"marca":"IBM"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":18,"marca":"SYSTEMAX"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":19,"marca":"FUJITSU"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":20,"marca":"SIMPLETECH"},{"activo":false,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":21,"marca":"NOMBRE"}]
#"""
    

Scenario: Crear una marca
When tengo una ruta
When tengo una marca
Then obtengo un estado 200
Then creo una marca

Scenario: Actualizar una marca
When tengo una ruta
When tengo una marca
Then obtengo un estado 200
Then actualizo una marca

Scenario: Borrar una marca
When tengo una ruta
When tengo una marca
Then obtengo un estado 200
Then elimino una marca

Scenario: Busqueda de una entidad marca por medio de id
When tengo un id
Then obtengo un estado 200
Then obtengo una marca

Scenario: Obtener una lista de marca
Then obtengo un estado 200
Then obtengo una lista de marcas:
"""
[{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":1,"marca":"HP"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":2,"marca":"LENOVO"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":3,"marca":"TOSHIBA"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":4,"marca":"SAMSUNG"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":5,"marca":"ACER"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":6,"marca":"DELL"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":7,"marca":"APPLE"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":8,"marca":"ASUS"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":9,"marca":"ALIENWARE"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":10,"marca":"GATEWAY"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":11,"marca":"LANIX"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":12,"marca":"VAIO"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":13,"marca":"SONY"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":14,"marca":"LG"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":15,"marca":"COMPAQ"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":16,"marca":"PANASONIC"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":17,"marca":"IBM"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":18,"marca":"SYSTEMAX"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":19,"marca":"FUJITSU"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":20,"marca":"SIMPLETECH"},{"activo":false,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":21,"marca":"NOMBRE"}]
"""


Scenario: Obtengo una lista de acuerdo un rango
When tengo un numero de inicio
When tengo un numero de finalizacion
Then obtengo un estado 200
Then obtengo una lista de rango:
"""
[{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":1,"marca":"HP"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":2,"marca":"LENOVO"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":3,"marca":"TOSHIBA"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":4,"marca":"SAMSUNG"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":5,"marca":"ACER"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":6,"marca":"DELL"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":7,"marca":"APPLE"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":8,"marca":"ASUS"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":9,"marca":"ALIENWARE"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":10,"marca":"GATEWAY"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":11,"marca":"LANIX"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":12,"marca":"VAIO"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":13,"marca":"SONY"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":14,"marca":"LG"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":15,"marca":"COMPAQ"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":16,"marca":"PANASONIC"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":17,"marca":"IBM"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":18,"marca":"SYSTEMAX"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":19,"marca":"FUJITSU"},{"activo":true,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":20,"marca":"SIMPLETECH"},{"activo":false,"descripcion":"DESCRIPCION","detalleEquipoCollection":[],"idMarca":21,"marca":"NOMBRE"}]
"""


Scenario: retorna cuantos elementos tiene la entidad marca
Then obtengo un estado 200
Then obtengo el numero de elementos marca 


