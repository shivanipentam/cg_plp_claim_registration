# cg_plp_claim_registration
create table User_Role(User_Name varchar(20) NOT NULL, password varchar(12), Role_Code varchar(10), primary key(User_Name));

insert into User_Role values('Venkat Kumar','Venkat28(','VTKm8');
insert into User_Role values('Sanjana Varma','Varma*(09','SAVa9');
insert into User_Role values('Rohini Reddy','rohinI6(0','RIRy0');
insert into User_Role values('Poojith Nayak','PnayaK98)','PHNk8');

select * from User_Role;

USER_NAME            PASSWORD     ROLE_CODE
-------------------- ------------ ----------
Venkat Kumar         Venkat28(    VTKm8
Sanjana Varma        Varma*(09    SAVa9
Rohini Reddy         rohinI6(0    RIRy0
Poojith Nayak        PnayaK98)    PHNk8


