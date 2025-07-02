---
title: Apuntes de clase/William
created: '2025-06-24T08:39:55.185Z'
modified: '2025-07-02T11:41:04.013Z'
---

# Apuntes de clase/William

## arranque dual
- Los sistemas operativos son independientes
- El gestor de arranque de linux es Grub
- El gestor de arranque de win: MBR
- windows version. 11 Pro/Home
- Linux distribución: Mint Cinnamon
mint deriva de Ubuntu
-> Ubuntu -> Debian

Nucleos: GNU/Linux -> UNix


## Virtualización

- oracle virtualbox v7

instalacion en linux
sudo apt install virtualbox (instala version 7.0.16)

- Vmare

## IDES
- Para Markdown: Notable
- Para códgio: VSC
- Oficial java: Apache Netbeans

## comandos de consola

### Win
- cmd -> iniciar consola
- dir -> ver directorio
- cd -> cambiar directorio
- cd.. -> subir nivel directorio
### linux
- clear -> limpia consola
- sudo -> privilegios superususario
- apt update -> actualizar repositorios
- apt upgrade -> actualizar aplicaciones
- apt install paquete -> Instalar paquete
- mkdir -> crear directorio
- ls -> lista
- pwd -> indica ruta donde estoy 


## Instalar Java y VSC
-Instalar Java

- LTS Arranque extendido

1. Ir a https://www.oracle.com/es/java/technologies/downloads/
2. Descargar version LTS (21)
3. Configurar ***variables entorno***
  - Ir a variables de entorno del sistema, a path y colocar la url de java...luego se comprueba por consola la instalación con....
  java --version

  - Vamos a instalar VSC

    - https://code.visualstudio.com/download#
    - Descargar VSC e instalar
    - Por extensiones podemos cambiar idioma (spanish)
    - Ahora se instalan extensiones: Extension pack for java
    - Verificar cambios en github...status
4. En casa tengo quehacer un clone...desde el repositorio


  ## Añadir personas al proyecto (colaborativo)

  En el repositorio, en la parte superior hay un menú ...pull request...esto significa que no se sube o queda guardado hasta que los compañeros no lo aprueban para que de esta manera si se pueda subir. Dentro de settings se tienen los colaboradores...add people
  ....

  ## comandos de git

- git status
- git add . -> añadir todos los archivos
- git add notes/Apuntes.md -> archivo individual
- git clone ***** -> "repo" clonar repositorio
- git commit -m "mensaje"  -> guardar cambios
- git commit -a -m "mensaje" -> añadir y guardara a la vez
- git push -> subir cambios
- git pull descargar version repo remoto (en local)

- git remote -> ver repositorios remotos
  - git remote add -> Añadir repo remoto
  - git remote -v -> ver repositorios remotos

- git fetch -> descarga cambios sin fusionar
- git merge -> fusiona cambios

## Ramas git

- git branch "nombre rama"-> crea una rama
- git checkout "nombre"-> cambiar de ramas
- git merge rama -> fusiona ramas
    pasos para fusionar:
    - git checkout
    - git merge rama_a_fusionar
    - git commit -m "Rama Fusionada"


## Roles proyectos

## linux mint

Se prepara una partición de windowa para poder realizar a instalación de linux
**crear y formartear particiones del disco duro**

- Administración de disco
- Pinchar SSD(c.)...con boton derecho se busca reducir volumen
- reducimos el volumen...usamos 100000 Mb. Se hizo en los Gb no asignados.
- se apaga y se reinicio la bios
- se va a boot...con F6 se selecciona lo que se requiere primero...se guarda con F10

- Luego se arranca desde el pendrive...se arranca con **linux mint 22.1 cinamon...**

## validadores HTML y CSS

HTML -> https://validator.w3.org/
CSS -> https://jigsaw.w3.org/css-validator/
## html

archivo...agregar carpeta al area de trabajo...selecciona la carpeta...

autoguardado desde archivo

Tener el validador siempre a mano

Los id son identifgicadores...en la misma pagina por ejemplo, solo debe haber un solo parrafo con p1

PAra hacer comentario...control, mayus,7

- Etiquetas

<html> nivel 1
<head>
<body>
    <p> nivel 2


marcados


## SEO

- Validación
- Palabras claves
- link's externos
- 

## listas

ordenadas y sin ordenar
sin ordenar

Para varios elementos...  ul>li*numero de eelementos de la lista. si se por {} adenro puede nuemrar los elementos.

ul>li*5{Elemento 1.$} #Ejemplo#


ul>li*7


## tablas en html

mirar como se usa el thead, tbody, tfoot

##formularios

action: 





















