Sin usar EntityGraph:
SELECT  segurotb0_.id_seguro  AS id_segur1_1_0_
       ,segurotb0_.empresa    AS empresa2_1_0_
       ,segurotb0_.fecha_alta AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja AS fecha_ba4_1_0_
FROM segurotb segurotb0_
WHERE segurotb0_.id_seguro = ?
SELECT  usuarios0_.id_seguro  AS id_segur5_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_1_
       ,usuarios0_.apellido   AS apellido2_2_1_
       ,usuarios0_.dni        AS dni3_2_1_
       ,usuarios0_.nombre     AS nombre4_2_1_
       ,usuarios0_.id_seguro  AS id_segur5_2_1_
FROM usuariotb usuarios0_
WHERE usuarios0_.id_seguro = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?
SELECT  vehiculos0_.id_seguro   AS id_segur4_3_0_
       ,vehiculos0_.id_vehiculo AS id_vehic1_3_0_
       ,vehiculos0_.id_vehiculo AS id_vehic1_3_1_
       ,vehiculos0_.color       AS color2_3_1_
       ,vehiculos0_.marca       AS marca3_3_1_
       ,vehiculos0_.id_seguro   AS id_segur4_3_1_
FROM vehiculotb vehiculos0_
WHERE vehiculos0_.id_seguro = ?
-----------
-- Segundo intento
-----------
SELECT  segurotb0_.id_seguro  AS id_segur1_1_0_
       ,segurotb0_.empresa    AS empresa2_1_0_
       ,segurotb0_.fecha_alta AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja AS fecha_ba4_1_0_
FROM segurotb segurotb0_
WHERE segurotb0_.id_seguro = ?
SELECT  usuarios0_.id_seguro  AS id_segur5_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_1_
       ,usuarios0_.apellido   AS apellido2_2_1_
       ,usuarios0_.dni        AS dni3_2_1_
       ,usuarios0_.nombre     AS nombre4_2_1_
       ,usuarios0_.id_seguro  AS id_segur5_2_1_
FROM usuariotb usuarios0_
WHERE usuarios0_.id_seguro = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?
SELECT  vehiculos0_.id_seguro   AS id_segur4_3_0_
       ,vehiculos0_.id_vehiculo AS id_vehic1_3_0_
       ,vehiculos0_.id_vehiculo AS id_vehic1_3_1_
       ,vehiculos0_.color       AS color2_3_1_
       ,vehiculos0_.marca       AS marca3_3_1_
       ,vehiculos0_.id_seguro   AS id_segur4_3_1_
FROM vehiculotb vehiculos0_
WHERE vehiculos0_.id_seguro = ?
-----------
-- 3º intent
-- He agregado el graph solo a los vehiculos
-----------
SELECT  segurotb0_.id_seguro    AS id_segur1_1_0_
       ,vehiculos1_.id_vehiculo AS id_vehic1_3_1_
       ,usuarios2_.id_usuario   AS id_usuar1_2_2_
       ,segurotb0_.empresa      AS empresa2_1_0_
       ,segurotb0_.fecha_alta   AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja   AS fecha_ba4_1_0_
       ,vehiculos1_.color       AS color2_3_1_
       ,vehiculos1_.marca       AS marca3_3_1_
       ,vehiculos1_.id_seguro   AS id_segur4_3_1_
       ,vehiculos1_.id_seguro   AS id_segur4_3_0__
       ,vehiculos1_.id_vehiculo AS id_vehic1_3_0__
       ,usuarios2_.apellido     AS apellido2_2_2_
       ,usuarios2_.dni          AS dni3_2_2_
       ,usuarios2_.nombre       AS nombre4_2_2_
       ,usuarios2_.id_seguro    AS id_segur5_2_2_
       ,usuarios2_.id_seguro    AS id_segur5_2_1__
       ,usuarios2_.id_usuario   AS id_usuar1_2_1__
FROM segurotb segurotb0_
LEFT OUTER JOIN vehiculotb vehiculos1_
ON segurotb0_.id_seguro = vehiculos1_.id_seguro
LEFT OUTER JOIN usuariotb usuarios2_
ON segurotb0_.id_seguro = usuarios2_.id_seguro
WHERE segurotb0_.id_seguro = ?

----
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?

SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?

---

SELECT  segurotb0_.id_seguro    AS id_segur1_1_0_
       ,vehiculos1_.id_vehiculo AS id_vehic1_3_1_
       ,segurotb0_.empresa      AS empresa2_1_0_
       ,segurotb0_.fecha_alta   AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja   AS fecha_ba4_1_0_
       ,vehiculos1_.color       AS color2_3_1_
       ,vehiculos1_.marca       AS marca3_3_1_
       ,vehiculos1_.id_seguro   AS id_segur4_3_1_
       ,vehiculos1_.id_seguro   AS id_segur4_3_0__
       ,vehiculos1_.id_vehiculo AS id_vehic1_3_0__
FROM segurotb segurotb0_
LEFT OUTER JOIN vehiculotb vehiculos1_
ON segurotb0_.id_seguro = vehiculos1_.id_seguro
WHERE segurotb0_.id_seguro = ?

----
----

SELECT  usuarios0_.id_seguro  AS id_segur5_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_1_
       ,usuarios0_.apellido   AS apellido2_2_1_
       ,usuarios0_.dni        AS dni3_2_1_
       ,usuarios0_.nombre     AS nombre4_2_1_
       ,usuarios0_.id_seguro  AS id_segur5_2_1_
FROM usuariotb usuarios0_
WHERE usuarios0_.id_seguro = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?

-----
-- Incluido el graph de usuarios en SeguroTb
-----

SELECT  segurotb0_.id_seguro    AS id_segur1_1_0_
       ,usuarios1_.id_usuario   AS id_usuar1_2_1_
       ,vehiculos2_.id_vehiculo AS id_vehic1_3_2_
       ,segurotb0_.empresa      AS empresa2_1_0_
       ,segurotb0_.fecha_alta   AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja   AS fecha_ba4_1_0_
       ,usuarios1_.apellido     AS apellido2_2_1_
       ,usuarios1_.dni          AS dni3_2_1_
       ,usuarios1_.nombre       AS nombre4_2_1_
       ,usuarios1_.id_seguro    AS id_segur5_2_1_
       ,usuarios1_.id_seguro    AS id_segur5_2_0__
       ,usuarios1_.id_usuario   AS id_usuar1_2_0__
       ,vehiculos2_.color       AS color2_3_2_
       ,vehiculos2_.marca       AS marca3_3_2_
       ,vehiculos2_.id_seguro   AS id_segur4_3_2_
       ,vehiculos2_.id_seguro   AS id_segur4_3_1__
       ,vehiculos2_.id_vehiculo AS id_vehic1_3_1__
FROM segurotb segurotb0_
LEFT OUTER JOIN usuariotb usuarios1_
ON segurotb0_.id_seguro = usuarios1_.id_seguro
LEFT OUTER JOIN vehiculotb vehiculos2_
ON segurotb0_.id_seguro = vehiculos2_.id_seguro
WHERE segurotb0_.id_seguro = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ?

----
----
SELECT  segurotb0_.id_seguro     AS id_segur1_1_0_
       ,usuarios1_.id_usuario    AS id_usuar1_2_1_
       ,contactos2_.id_contacto  AS id_conta1_0_2_
       ,vehiculos3_.id_vehiculo  AS id_vehic1_3_3_
       ,segurotb0_.empresa       AS empresa2_1_0_
       ,segurotb0_.fecha_alta    AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja    AS fecha_ba4_1_0_
       ,usuarios1_.apellido      AS apellido2_2_1_
       ,usuarios1_.dni           AS dni3_2_1_
       ,usuarios1_.nombre        AS nombre4_2_1_
       ,usuarios1_.id_seguro     AS id_segur5_2_1_
       ,usuarios1_.id_seguro     AS id_segur5_2_0__
       ,usuarios1_.id_usuario    AS id_usuar1_2_0__
       ,contactos2_.num_telefono AS num_tele2_0_2_
       ,contactos2_.id_usuario   AS id_usuar3_0_2_
       ,contactos2_.id_usuario   AS id_usuar3_0_1__
       ,contactos2_.id_contacto  AS id_conta1_0_1__
       ,vehiculos3_.color        AS color2_3_3_
       ,vehiculos3_.marca        AS marca3_3_3_
       ,vehiculos3_.id_seguro    AS id_segur4_3_3_
       ,vehiculos3_.id_seguro    AS id_segur4_3_2__
       ,vehiculos3_.id_vehiculo  AS id_vehic1_3_2__
FROM segurotb segurotb0_
LEFT OUTER JOIN usuariotb usuarios1_
ON segurotb0_.id_seguro = usuarios1_.id_seguro
LEFT OUTER JOIN contactotb contactos2_
ON usuarios1_.id_usuario = contactos2_.id_usuario
LEFT OUTER JOIN vehiculotb vehiculos3_
ON segurotb0_.id_seguro = vehiculos3_.id_seguro
WHERE segurotb0_.id_seguro = ?

---
-- Perfecto!
---
SELECT  segurotb0_.id_seguro          AS id_segur1_1_0_
       ,usuarios1_.id_usuario         AS id_usuar1_3_1_
       ,contactos2_.id_contacto       AS id_conta1_0_2_
       ,tipocontac3_.id_tipo_contacto AS id_tipo_1_2_3_
       ,vehiculos4_.id_vehiculo       AS id_vehic1_4_4_
       ,segurotb0_.empresa            AS empresa2_1_0_
       ,segurotb0_.fecha_alta         AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja         AS fecha_ba4_1_0_
       ,usuarios1_.apellido           AS apellido2_3_1_
       ,usuarios1_.dni                AS dni3_3_1_
       ,usuarios1_.nombre             AS nombre4_3_1_
       ,usuarios1_.id_seguro          AS id_segur5_3_1_
       ,usuarios1_.id_seguro          AS id_segur5_3_0__
       ,usuarios1_.id_usuario         AS id_usuar1_3_0__
       ,contactos2_.num_telefono      AS num_tele2_0_2_
       ,contactos2_.id_usuario        AS id_usuar3_0_2_
       ,contactos2_.id_usuario        AS id_usuar3_0_1__
       ,contactos2_.id_contacto       AS id_conta1_0_1__
       ,tipocontac3_.id_contacto      AS id_conta3_2_3_
       ,tipocontac3_.descripcion      AS descripc2_2_3_
       ,tipocontac3_.id_contacto      AS id_conta3_2_2__
       ,tipocontac3_.id_tipo_contacto AS id_tipo_1_2_2__
       ,vehiculos4_.color             AS color2_4_4_
       ,vehiculos4_.marca             AS marca3_4_4_
       ,vehiculos4_.id_seguro         AS id_segur4_4_4_
       ,vehiculos4_.id_seguro         AS id_segur4_4_3__
       ,vehiculos4_.id_vehiculo       AS id_vehic1_4_3__
FROM segurotb segurotb0_
LEFT OUTER JOIN usuariotb usuarios1_
ON segurotb0_.id_seguro = usuarios1_.id_seguro
LEFT OUTER JOIN contactotb contactos2_
ON usuarios1_.id_usuario = contactos2_.id_usuario
LEFT OUTER JOIN tipocontactotb tipocontac3_
ON contactos2_.id_contacto = tipocontac3_.id_contacto
LEFT OUTER JOIN vehiculotb vehiculos4_
ON segurotb0_.id_seguro = vehiculos4_.id_seguro
WHERE segurotb0_.id_seguro = ?