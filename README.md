# 🌐 Ejercicio — Gestión de Plan de Hosting

---

## 📝 Descripción

El sistema implementa la clase PlanHosting para gestionar el espacio de un dominio web, validando los valores iniciales de almacenamiento y garantizando que las nuevas cargas de archivos no superen la capacidad máxima contratada.

---

## 🚀 Funcionalidades e Implementación

### 📦 Clase PlanHosting

* **Atributos:**
* **nombreDominio** (String): Dirección o URL del sitio web hospedado.
* **capacidadMaximaGB** (int): Límite total de almacenamiento contratado expresado en gigabytes.
* **espacioOcupadoGB** (double): Espacio actualmente utilizado en el servidor en gigabytes.


* **Métodos Implementados:**
* **Constructor PlanHosting:** Asigna los datos iniciales y valida que tanto la capacidad máxima como el espacio ocupado sean mayores a cero; de lo contrario, asigna un valor por defecto de 1 GB e informa el error.
* **subirArchivos(double pesoGB):** Evalúa el peso del archivo a cargar. Si es mayor a cero y la suma con el espacio ocupado no excede la capacidad máxima, incrementa el almacenamiento utilizado; de lo contrario, rechaza la operación informando el motivo.
* **mostrarDetalles():** Imprime en consola el nombre del dominio, la capacidad máxima permitida y el espacio actualmente ocupado.



---

## 💻 Programa Principal (main)

El flujo principal ejecuta la siguiente simulación de almacenamiento:

1. Instancia el plan para "netero.com" con 15 GB de capacidad máxima y 5 GB ocupados inicialmente.
2. Realiza la carga exitosa de un primer archivo de 5.5 GB.
3. Realiza la carga exitosa de un segundo archivo de 2.5 GB.
4. Intenta cargar un tercer archivo de 5.8 GB, el cual es rechazado por superar el límite del servidor.
5. Muestra en pantalla los detalles actualizados del espacio disponible.
