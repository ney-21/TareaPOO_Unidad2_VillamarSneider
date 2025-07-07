
# 🎬 Sistema de Gestión de Contenidos Audiovisuales

## Objetivo
Este proyecto implementa un sistema de gestión de contenidos audiovisuales utilizando conceptos avanzados de Programación Orientada a Objetos (POO) en Java, como herencia, asociación, agregación y composición.

## Clases y Funcionalidades Nuevas

✔ **Actor**: Relacionado con Película, permite asociar actores.  
✔ **Temporada**: Relacionado con SerieDeTV, representa las temporadas de una serie.  
✔ **Investigador**: Relacionado con Documental, indica el investigador asociado.  
✔ **VideoTikTok**: Nueva subclase de ContenidoAudiovisual, representa videos cortos.  
✔ **Podcast**: Nueva subclase de ContenidoAudiovisual, representa podcasts.  

## Instrucciones de Instalación y Uso

### 📥 Clonar el repositorio
En tu terminal o Git Bash, ejecuta:

```https://github.com/ney-21/TareaPOO_Unidad2_VillamarSneider.git```

### 🛠️ Importar el proyecto en Eclipse

1. Abre Eclipse.  
2. Selecciona **File → Import → Existing Projects into Workspace**.  
3. Navega hasta la carpeta del proyecto que clonaste.  
4. Asegúrate que el proyecto aparezca seleccionado y haz clic en **Finish**.  

### ▶️ Ejecutar la aplicación

1. Dentro de Eclipse, ubica el archivo `PruebaAudioVisual.java` en el paquete `poo`.  
2. Haz clic derecho sobre el archivo y selecciona **Run As → Java Application**.  
3. Se mostrará la información por consola, incluyendo:
   - Detalles de todos los contenidos audiovisuales.  
   - Información de actores, temporadas e investigadores.  
   - Ejemplo de búsqueda de películas por nombre de actor.  

### ⚙️ Requisitos

- Tener Java instalado (versión 8 o superior).  
- Eclipse o cualquier IDE compatible con Java.  

### 🎯 Ejemplo de salida esperada

```plaintext
==============================================
🎬 Bienvenido al Sistema de Gestión de Contenidos Audiovisuales
==============================================

🧾 Mostrando todos los contenidos audiovisuales:
Detalles de la película:
ID: 0
Título: Avatar
Duración en minutos: 125
Género: Acción
Estudio: 20th Century Studios
Actores:
- Leonardo Wilhelm DiCaprio
- Kate Winslet
...
🔍 Buscando películas con el actor: Leonardo Wilhelm DiCaprio
🎞 Avatar incluye al actor Leonardo Wilhelm DiCaprio
🎞 Inception incluye al actor Leonardo Wilhelm DiCaprio
```

## Mejoras Adicionales

✔ Uso de listas para almacenar actores, temporadas, etc.  
✔ Búsqueda de películas por nombre de actor.  
✔ Ejemplos de reutilización de objetos.  

## Autor

*Sneider Villamar Peñafiel*  
*Universidad Politécnica Salesiana*  