# 🎬 Sistema de Gestión de Contenidos Audiovisuales

## Objetivo

Este proyecto implementa un sistema de gestión de contenidos audiovisuales utilizando conceptos avanzados de **Programación Orientada a Objetos (POO)** en Java. A lo largo de sus etapas se integran:

- Herencia, asociación, agregación y composición
- Principios **SOLID**
- Patrón de arquitectura **MVC**
- Manejo de archivos **CSV**
- Pruebas unitarias con **JUnit 5**

---

## 📦 Clases y Funcionalidades

✔ **Actor**: Relacionado con Película  
✔ **Temporada**: Relacionado con SerieDeTV  
✔ **Investigador**: Relacionado con Documental  
✔ **VideoTikTok** y **Podcast**: Nuevas subclases  
✔ **ContenidoService**: Servicio que controla lógica de búsqueda y visualización  
✔ **ArchivoX.java**: Guardado y lectura de cada tipo en CSV  
✔ **JUnit Tests**: Pruebas unitarias para modelos y servicios

---

## 🧠 Diseño (Unidad 4)

### ✅ Principios SOLID implementados

- **SRP**: Cada clase tiene una responsabilidad clara  
- **OCP**: Uso de clases abstractas e interfaces (`ContenidoAudiovisual`, `IContenidoService`)  
- **LSP**: Todas las subclases son sustituibles  
- **ISP**: Interfaces como `Mostrable`, `GuardableCSV`  
- **DIP**: Controlador depende de `IContenidoService`, no de la implementación concreta  

### ✅ Patrón MVC aplicado

- **Modelo**: Clases como `Pelicula`, `Podcast`, `SerieDeTV`  
- **Vista**: Clase `MenuConsola` para interacción por consola  
- **Controlador**: Clase `ContenidoController`  
- **App.java**: Punto de entrada con inyección de dependencias

---

## 📂 Estructura del proyecto
poo_unidad2/
├── src/
│ ├── uni1a/ # Modelos
│ ├── uni1a/archivos/ # Lectura y escritura CSV
│ ├── uni1a/interfaces/ # Interfaces SOLID
│ ├── uni1a/servicios/ # Lógica del sistema
│ ├── uni1a/controlador/ # Controlador MVC
│ └── uni1a/vista/ # Menú por consola
│
├── test/
│ └── uni1a/ # Pruebas unitarias con JUnit 5
│
└── App.java # Clase main (MVC inyectado)

---

## ▶️ Cómo ejecutar

1. Abre el proyecto en Eclipse  
2. Ejecuta `App.java` (clic derecho → Run As → Java Application)  
3. Usa el menú en consola para:
   - Mostrar todos los contenidos
   - Buscar películas por nombre de actor
   - Salir del sistema

---

## 🧪 Pruebas unitarias (JUnit 5)

### Clases con prueba unitaria:
- ✅ `PeliculaTest`
- ✅ `SerieDeTVTest`
- ✅ `PodcastTest`
- ✅ `DocumentalTest`
- ✅ `VideoTikTokTest`
- ✅ `ContenidoServiceTest`
- ✅ `ArchivoPeliculaTest`

Para ejecutarlas:
- Clic derecho en la carpeta `test/` → Run As → JUnit Test  
- Todas deben pasar (✔ verde)

---

## 🛠️ Instrucciones de instalación

### 📥 Clonar el repositorio
```bash
git clone https://github.com/ney-21/TareaPOO_Unidad2_VillamarSneider.git

🧩 Importar en Eclipse
File → Import → Existing Projects into Workspace

Selecciona la carpeta clonada

Finaliza y abre App.java para ejecutar

🎯 Ejemplo de salida esperada

==============================================
🎬 Bienvenido al Sistema de Gestión de Contenidos Audiovisuales
==============================================
1. Ver todos los contenidos
2. Buscar películas por actor
3. Salir


