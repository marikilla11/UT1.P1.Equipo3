# UT1.P1.Equipo3
1. Pasos básicos del trabajo realizado
Se creó el repositorio en GitHub por parte de María.
Se añadieron al resto de miembros como colaboradores.
Cada miembro hizo un git clone para tener el repositorio en su equipo local.
Se creó un archivo README.md inicial. 
Se implementaron las funcionalidades de la calculadora en ramas diferentes:
suma:Maria.
resta:Juan.
multiplicación:Laura.
división:Marta.
potencia:Maria.
raízcuadrada:Juan.
Cada rama fue subida al repositorio remoto en Github con git push y luego integrada en main mediante git merge.
Se generó un conflicto intencionado (línea dummy) para practicar la resolución de conflictos.
Finalmente, se añadieron las operaciones de potencia y raíz cuadrada en nuevas ramas y se fusionaron con la rama principal.
2. Incidencias encontradas y resolución

Conflicto en merge: dos ramas modificaron la misma línea en Operaciones.java.
  Se resolvió editando manualmente el archivo, eligiendo el código correcto y confirmando con git add + git commit.

Problemas con push en ramas nuevas: un compañero no podía subir su rama porque no estaba vinculada.
  Se resolvió con git push -u origin nombre-rama.

Errores por no hacer pull: algunos commits entraban en conflicto al no actualizar el repositorio antes de trabajar.
  Se acordó como norma hacer siempre git pull origin main antes de comenzar a programar.

3. Guía de colaboración para nuevos integrantes
Si un nuevo miembro quiere unirse al proyecto, debe seguir estos pasos:
Clonar el repositorio:
git clone URL-del-repositorio
2. Crear una nueva rama para su tarea:
git checkout -b nombre-de-rama
3. Hacer cambios en el código y guardarlos:
git add .
git commit -m "Descripción breve del cambio"
4. Subir su rama al repositorio remoto:
git push -u origin nombre-rama
