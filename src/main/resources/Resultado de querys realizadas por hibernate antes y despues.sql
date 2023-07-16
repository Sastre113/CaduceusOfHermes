

Sin usar EntityGraph:
SELECT  segurotb0_.id_seguro  AS id_segur1_1_0_
       ,segurotb0_.empresa    AS empresa2_1_0_
       ,segurotb0_.fecha_alta AS fecha_al3_1_0_
       ,segurotb0_.fecha_baja AS fecha_ba4_1_0_
FROM segurotb segurotb0_
WHERE segurotb0_.id_seguro = ? Hibernate:
SELECT  usuarios0_.id_seguro  AS id_segur5_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_0_
       ,usuarios0_.id_usuario AS id_usuar1_2_1_
       ,usuarios0_.apellido   AS apellido2_2_1_
       ,usuarios0_.dni        AS dni3_2_1_
       ,usuarios0_.nombre     AS nombre4_2_1_
       ,usuarios0_.id_seguro  AS id_segur5_2_1_
FROM usuariotb usuarios0_
WHERE usuarios0_.id_seguro = ? Hibernate:
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ? Hibernate:
SELECT  contactos0_.id_usuario   AS id_usuar3_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_0_
       ,contactos0_.id_contacto  AS id_conta1_0_1_
       ,contactos0_.num_telefono AS num_tele2_0_1_
       ,contactos0_.id_usuario   AS id_usuar3_0_1_
FROM contactotb contactos0_
WHERE contactos0_.id_usuario = ? Hibernate:
SELECT  vehiculos0_.id_seguro   AS id_segur4_3_0_
       ,vehiculos0_.id_vehiculo AS id_vehic1_3_0_
       ,vehiculos0_.id_vehiculo AS id_vehic1_3_1_
       ,vehiculos0_.color       AS color2_3_1_
       ,vehiculos0_.marca       AS marca3_3_1_
       ,vehiculos0_.id_seguro   AS id_segur4_3_1_
FROM vehiculotb vehiculos0_
WHERE vehiculos0_.id_seguro = ?