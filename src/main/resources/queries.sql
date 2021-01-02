select * from employee;
select * from department;

INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('1', '1', 'odin');
INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('2', '1', 'amaya');
INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('3', '1', 'sandra');
INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('4', '2', 'minerva');
INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('5', '2', 'esteban');
INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('6', '3', 'hugo');
INSERT INTO `jhibernatecookbook`.`employee` (`id_employee`, `id_department`, `name`) VALUES ('6', '3', 'gaby');

INSERT INTO `jhibernatecookbook`.`department` (`id_department`, `name`) VALUES ('1', 'tizayuca');
INSERT INTO `jhibernatecookbook`.`department` (`id_department`, `name`) VALUES ('2', 'ecatepec');
INSERT INTO `jhibernatecookbook`.`department` (`id_department`, `name`) VALUES ('3', 'palermo');


INSERT INTO `jhibernatecookbook`.`product` (`name`, `price`, `category_id`) VALUES ('Meeting room table', '100.23', '1');
INSERT INTO `jhibernatecookbook`.`product` (`name`, `price`, `category_id`) VALUES ('Metal bookcases', '120', '1');
INSERT INTO `jhibernatecookbook`.`product` (`name`, `price`, `category_id`) VALUES ('Ligthning', '70.36', '1');
INSERT INTO `jhibernatecookbook`.`product` (`name`, `price`, `category_id`) VALUES ('Business envelopes', '40.92', '2');
INSERT INTO `jhibernatecookbook`.`product` (`name`, `price`, `category_id`) VALUES ('Paper clips', '20.61', '2');
INSERT INTO `jhibernatecookbook`.`product` (`name`, `price`, `category_id`) VALUES ('HIghlighters', '30', '2');
