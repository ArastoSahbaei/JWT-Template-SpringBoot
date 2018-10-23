/*-- Scans
insert into scan(id, date_created, latitude, longitude, qr_code) values (1, '2018-10-08 10:30:00', 57.4, 12.5, '87790472-785b-438b-aafe-fe6291b6f6ea');

-- Components
insert into component(id, date_created, latitude, longitude, qr_code) values (1, '2018-10-08 10:30:00',57.4, 12.5, '87790472-785b-438b-aafe-fe6291b6f6ea');
insert into component(id, date_created, latitude, longitude, qr_code) values (2, '2018-10-08 10:30:00',57.4, 12.5, '345857a0-0ab5-4640-a79d-777b2ef8d8e3');
insert into component(id, date_created, latitude, longitude, qr_code) values (3, '2018-10-08 10:30:00',57.4, 12.5, '0bde3603-9962-4384-b172-a3d9a75cc6b4');
insert into component(id, date_created, latitude, longitude, qr_code) values (4, '2018-10-08 10:30:00',57.4, 12.5, 'be2992f2-c0ad-4c78-95f4-3a059886a16a');
insert into component(id, date_created, latitude, longitude, qr_code) values (5, '2018-10-08 10:30:00',57.4, 12.5, 'a55b219c-f041-43bf-9c7c-c91f3d0a805c');
insert into component(id, date_created, latitude, longitude, qr_code) values (6, '2018-10-08 10:30:00', 57.4, 12.5, 'c0ba64d8-0ed6-4b08-8221-ce027bc7cb6f');

-- Products
insert into product(id, date_created, image_url, product_name) values (1, '2018-10-08 10:30:00',"http://image.png", "Oil Filter");
insert into product(id, date_created, image_url, product_name) values (2, '2018-10-08 10:30:00',"http://image.png", "Water Filter");
insert into product(id, date_created, image_url, product_name) values (3, '2018-10-08 10:30:00',"http://image.png", "Fuel Filter");

insert into product_components values (1,1);
insert into product_components values (1,2);
insert into product_components values (2,3);
insert into product_components values (2,4);
insert into product_components values (3,5);
insert into product_components values (3,6);


insert into component_scans values (1,1);*/