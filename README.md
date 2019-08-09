# UNISocial
El Ministerio de Educación ha lanzado una licitación para realizar el diseño y desarrollo de una red social para cada una de las Universidades Públicas del país con la finalidad de mejorar y fortalecer las relaciones no formales dentro de cada institución, además de utilizar a ésta como un medio para compartir información. Hemos sido afortunados y logramos ganar la misma.
Nuestros analistas funcionales ya han realizado su trabajo y del mismo surgieron los siguientes requerimientos para la primera iteración:

1. Un usuario deberá poder identificarse con: nombre, apellido, fecha de nacimiento, legajo o número de identificación dentro de la universidad, mail, número de teléfono móvil y rol. Los roles pueden ser: alumno, docente, no docente, directivo, empleado administrativo, empleado comercial.

2. Cada usuario deberá poder realizar aportes. En un aporte se podrán compartir diferentes tipos de archivos junto a una especificación sobre qué tópico de la facultad está involucrado.

3. Cada usuario deberá poder puntuar aportes: cuando se realiza una puntuación sobre un aporte (del 1 al 5, donde 5 es “aporte genial” y 1 es “pésimo aporte”), ésta influirá positiva o negativamente sobre la reputación del usuario aportador.
Un usuario nuevo siempre tiene “buena reputación”, pero si cuando se le hace una puntuación la sumatoria de todas las puntuaciones sobre la cantidad de aportes multiplicado por dos da <3, entonces pasará a tener “mala reputación”.
Cuando un usuario tiene mala reputación, no podrá realizar aportes. Para volver a tener buena reputación, el usuario administrador deberá darle otra chance de aporte.