
-- EXE 3
CREATE DATABASE EXE3;
SHOW DATABASES;
USE EXE3;

-- Q1A
create table customer(
id integer primary key not null,
customer_name varchar(255) not null,
city_id int not null,
customer_address varchar(255) not null,
contact_person varchar(255),
email varchar(128) not null,
phone varchar(128) not null
);

create table product(
id integer primary key not null,
sku varchar(32) not null,
product_name varchar(128) not null,
product_description text not null,
current_price decimal(8,2) not null,
quantity_in_stock integer not null
);

create table invoice (
id integer primary key not null,
invoice_number varchar(255) not null,
customer_id integer not null,
user_account_id integer not null,
total_price decimal(8,2) not null,
time_issued varchar(20),
time_due varchar(20),
time_paid varchar(20),
time_canceled varchar(20),
time_refunded varchar(20),
foreign key (customer_id) references customer(id)
);

create table invoice_item(
id integer primary key not null,
invoice_id integer not null,
product_id integer not null,
quantity integer not null,
price decimal(8,2) not null,
line_total_price decimal(8,2) not null,
foreign key (invoice_id) references invoice(id),
foreign key (product_id) references product(id)
);


-- Q1B
insert into customer values 
(1, 'Drogerie Wien', 1, 'Deckergasse 15A', 'Emil Steinbach', 'abc@gmail.com', '12345678'),
(2, 'John', 4, 'Deckergasse 1A', '9upper', 'abck@gmail.com', '1234567'),
(3, 'Mary', 8, 'Deckergasse 18A', '9upper', 'abc@gmail.com', '123456789');

insert into product values 
(1, '330120', '9UP PRODUCT', 'COMPLETELY 9UP', 60 , 122),
(2, '330121', '9UPPER PRODUCT', 'COMPLETELY 9UPPER', 50, 50),
(3, '330122', '9UPPER PRODUCTS', 'SUPER 9UPPER', 40, 600),
(4, '330123', '9UPPER PRODUCTSS', 'SUPER COMPLETELY 9UPPER', 30, 500);

insert into invoice values
(1, '123456780', 2, 41, 1423, null, null, null, null, null),
(2, '123456780', 3, 42, 1400, null, null, null, null, null),
(3, '123456780', 2, 43, 17000, null, null, null, null, null);

insert into invoice_item values
(1, 1, 1, 40, 23, 920),
(2, 1, 2, 4, 20, 80),
(3, 1, 3, 4, 10, 40),
(4, 1, 2, 4, 30, 120);

-- Q1C
select 'customer' as 'customer/product',id, customer_name as 'name' from customer c where not exists (select * from invoice i where i.customer_id = c.id) union
select 'product' as 'customer/product', id, product_name as 'name' from product p where not exists ( select * from invoice_item i where i.product_id = p.id);

-- Q2
create table employee(
id integer not null auto_increment primary key,
employee_name varchar(30) not null,
salary numeric(8,2),
phone numeric(15),
email varchar(50),
dept_id integer not null
);

create table department(
id integer not null auto_increment primary key,
dept_code varchar(3) not null,
dept_name varchar(200) not null
);

-- Q2A
insert into employee values
(1, 'JOHN', 20000, 90234567, 'JOHN@GMAIL.COM', 1),
(2, 'MARY', 10000, 90234561, 'MARY@GMAIL.COM', 1),
(3, 'STEVE', 30000, 90234562, 'STEVE@GMAIL.COM', 3),
(4, 'SUNNY', 40000, 90234563, 'SUNNY@GMAIL.COM', 4);

insert into department values
(1, 'HR', 'HUMAN RESOURCES'),
(2, '9UP', '9UP DEPARTMENT'),
(3, 'SA', 'SALES DEPARTMENT'),
(4, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');

select d.dept_code , count(*) as NR_OF_DEPT_MEMBER from employee e, department d
where e.dept_id = d.id group by d.id;

-- Q2B
delete from department where id =5;
insert into department values (5, 'IT', 'INFORMATION TECHNOLOGY DEPARTMENT');
select * from department