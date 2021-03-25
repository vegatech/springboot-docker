# springboot-docker

# Aplicacion Springboot con Docker
  Jdk 11
  H2

# instrucciones a ejecutar en PowerShell
  

   
  - Ingresar a la carpeta proyecto "productos" y ejecutar:
-  1-  .\mvnw clean package
 - 2-  docker build -t servicio-productos:v1 .
  
  - Ingresar al la carpeta proyecto "precios" y ejecutar: 
-  1.-  .\mvnw clean package
-  2.-  docker build -t servicio-precios:v1 .
 - 3.-  docker-compose up  
  
  
 # para ver documentacion ingresar a los siguientes links:
 
- http://localhost:8081/swagger-ui.html#/
  
- http://localhost:8082/swagger-ui.html#/
  
  
  
  
  
  
  
 
