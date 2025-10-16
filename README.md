# 🧪 Taller de Testing en Java con TDD.

---

## 🧭 Objetivo

Aprender y practicar el ciclo **TDD: Red → Green → Refactor**:
1. ✴️ **Red**: Escribir una prueba que falle (porque el código aún no existe o no funciona).
2. ✅ **Green**: Escribir el código mínimo necesario para que la prueba pase.
3. ♻️ **Refactor**: Mejorar el código sin romper las pruebas.

---

## ⚙️ Requisitos

- **Java 21** o superior
- Un IDE (IntelliJ IDEA)
- Conexión a internet (para descargar dependencias)

---

## 🚀 Preparación del entorno

1. Clona este repositorio:
   ```bash
   git clone https://github.com/tu-org/taller-tdd-java.git
    ```
2. Abre el repositorio como un proyecto de intellij idea.

--

## Password Validator
Implementar PasswordValidator.java para pasar las pruebas:

Longitud mínima: 6

Debe tener al menos una mayúscula

Un número

Un caracter especial ($, !, @, etc.)

💬 En esta parte puedes refactorizar por etapas:

Versión 1: condicionales anidados

Versión 2: uso de expresiones regulares

Comparar legibilidad y mantenibilidad
