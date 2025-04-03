# Máquina Tragamonedas GUI

## Descripción del Proyecto
La *Máquina Tragamonedas GUI* es un simulador interactivo de una máquina tragamonedas. Utiliza Java y una interfaz gráfica para representar el juego, permitiendo a los usuarios girar carretes y verificar combinaciones ganadoras. El proyecto está diseñado siguiendo el patrón *Modelo-Vista-Controlador (MVC)*, lo que facilita la organización y comprensión del código.

---

## Requisitos del Sistema
Antes de ejecutar el proyecto, asegúrate de cumplir con los siguientes requisitos:
- *Java Development Kit (JDK)* versión 8 o superior.
- *NetBeans IDE* para un entorno de desarrollo integrado y optimizado.
- Carpeta de recursos gráficos con las imágenes requeridas, colocadas en src/main/resources/imagenes.

---

## Cómo Ejecutar el Proyecto
1. *Descargar o clonar el proyecto:*
   - Clona el repositorio utilizando Git:
     bash
     git clone https://github.com/tu_usuario/maquinatragamonedas.git
     
   - O descarga el archivo ZIP y descomprímelo.

2. *Abrir el proyecto en NetBeans:*
   - Abre NetBeans IDE.
   - Ve a *File > Open Project* y selecciona la carpeta principal del proyecto.

3. *Configurar el proyecto:*
   - Asegúrate de que el JDK esté correctamente configurado en NetBeans. Ve a *Tools > Java Platforms* y selecciona el JDK correspondiente.

4. *Compilar el proyecto:*
   - Haz clic derecho en el nombre del proyecto en el árbol de proyectos y selecciona *Clean and Build* para compilarlo.

5. *Ejecutar el proyecto:*
   - Haz clic derecho en el archivo JuegoTragamonedasGUI.java dentro del paquete maquinatragamonedas.
   - Selecciona *Run File* para iniciar la aplicación.

---

## Estructura del Código
El proyecto está organizado en el paquete maquinatragamonedas, dividido en las siguientes clases:

### 1. *Modelo:*
   - **Simbolo:** Representa un símbolo con una ruta de imagen asociada.
   - **Carrete:** Contiene una lista de símbolos y permite obtener un símbolo aleatorio al girar.
   - **MaquinaTragamonedas:** Integra tres carretes, ofrece funcionalidad para girarlos y verifica combinaciones ganadoras.

### 2. *Vista:*
   - **VistaTragamonedasGUI:** Clase que gestiona la interfaz gráfica, incluyendo botones, mensajes y los carretes con los símbolos obtenidos.

### 3. *Controlador:*
   - **ControladorTragamonedas:** Conecta el modelo con la vista y gestiona la lógica del juego.

### 4. *Clase Principal:*
   - **JuegoTragamonedasGUI:** Inicia el modelo, la vista y el controlador, estableciendo las conexiones necesarias para ejecutar el juego.

---

## Recursos Gráficos
Las imágenes necesarias para los carretes deben estar en la carpeta:
