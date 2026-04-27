# DistribuidoraApp

Aplicación móvil desarrollada en Android que permite a los usuarios iniciar sesión mediante Firebase y almacenar su ubicación en tiempo real.

---

## Funcionalidades

- Login con correo y contraseña (Firebase Authentication)
- Obtención de ubicación GPS
- Almacenamiento de latitud y longitud en Firebase Realtime Database
- Ejecución en dispositivo Android

---

##Tecnologías utilizadas

- Android Studio
- Java
- Firebase Authentication
- Firebase Realtime Database
- Google Play Services (Location)

---

## Estructura del proyecto

- MainActivity → Pantalla de login
- MenuActivity → Pantalla principal después del login
- Ubicacion → Clase que guarda latitud y longitud
- activity_main.xml → Interfaz de login
- activity_menu.xml → Interfaz de menú

---

##  Configuración

1. Crear proyecto en Firebase
2. Descargar archivo google-services.json
3. Agregarlo en la carpeta app
4. Activar Authentication (Email/Password)
5. Activar Realtime Database

Kevin Santiago Betancourt Mesa - Angie Millan
