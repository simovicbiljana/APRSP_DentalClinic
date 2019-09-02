INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Brasan ordinacija', 'Danila Kisa 39', '564457');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Dental lux', 'Maksima Gorkog 46', '381856');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Denta', 'Knjaza Milosa 59', '818144');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Zub', 'Milosa Orenovica', '512369');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Foraj', 'Knjaza Milosa 59', '818144');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Dental plus', 'Narodnog fronta 1', '818144');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Dental scan', 'Gogoljeva 2', '818144');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Osmeh', 'Alekse Santica 3', '818144');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Zdrav osmeh', 'Lasla Gala 8', '818144');
INSERT INTO Workplace (WorkplaceID, NameOfWorkplace, Address, Phone) VALUES (NEXTVAL('workplace_seq'), 'Estetika dentist', 'Krilova 6', '818144');



INSERT INTO Material (MaterialID, NameOfMaterial, ManufacturedName, Quantity) VALUES (NEXTVAL('material_seq'), 'cirkonijum', 'Oral B', '130');
INSERT INTO Material (MaterialID, NameOfMaterial, ManufacturedName, Quantity) VALUES (NEXTVAL('material_seq'), 'molibden', 'Sensodayne', '150');
INSERT INTO Material (MaterialID, NameOfMaterial, ManufacturedName, Quantity) VALUES (NEXTVAL('material_seq'), 'hydrogum soft', 'Alpro medical', '150');
INSERT INTO Material (MaterialID, NameOfMaterial, ManufacturedName, Quantity) VALUES (NEXTVAL('material_seq'), 'hydrocolor', 'Dentalfarm', '100');



INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Kermacika kruna', '100');
INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Parcijalna proteza', '130');
INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Hirurska ekstrakcija zuba', '75');
INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Frezovana kruna', '150');
INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Ekstrakcija zuba', '100');
INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Implant proteza', '500');
INSERT INTO TypeOfService (TypeOfServiceID, NameOfTypeService, Price) VALUES (NEXTVAL('type_of_service_seq'), 'Dvofazni implant', '450');



INSERT INTO Specialty (SpecialtyID, NameOfSpecialty, AcademicTitle) VALUES (NEXTVAL('specialty_seq'), 'Stomatolog', 'Doktor stomatologije');
INSERT INTO Specialty (SpecialtyID, NameOfSpecialty, AcademicTitle) VALUES (NEXTVAL('specialty_seq'), 'Zubni tehnicar', 'Doktor stomatologije');
INSERT INTO Specialty (SpecialtyID, NameOfSpecialty, AcademicTitle) VALUES (NEXTVAL('specialty_seq'), 'Oralni hirurg', 'Doktor medicinskih nauka');
INSERT INTO Specialty (SpecialtyID, NameOfSpecialty, AcademicTitle) VALUES (NEXTVAL('specialty_seq'), 'Oralni higijenicar', 'Doktor medicinskih nauka');
INSERT INTO Specialty (SpecialtyID, NameOfSpecialty, AcademicTitle) VALUES (NEXTVAL('specialty_seq'), 'Stomatoloska sestra', 'Diplomirana stomatoloska sestra');



INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Biljana', 'Simovic','1990-09-20', 'Danila Kisa 39', '0644026269', '1811995795010', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Gorana', 'Gajic','1994-09-19', 'Danila Kisa 19', '0641234569', '1811995795010', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Milos', 'Radovanovic','1992-09-03', 'Hopovska 5', '0653650120', '030999212369', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Bogdan', 'Sljivic','1994-09-19', 'Krilova 1', '0651021470', '190999479501', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Marija', 'Djordjevic','1987-03-25', 'Narodnog fronta 5', '0612030356', '25039877950', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Aleksandra', 'Milovanovic','1973-09-19', 'Bulevar oslobodjenja 1', '0653012870', '090997379501', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Aleksa', 'Bondzulic','2002-01-03', 'Doza Djerdja 51', '0645893102', '181199579501', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Milan', 'Radovanovic','1991-09-19', 'Kolo srpskih sestara 1', '0654587325', '030100279501', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Djordje', 'Milosevic','1971-09-19', 'Futoska 5', '0634587369', '1205971579501', 'Cave penicillini');
INSERT INTO Patient (PatientID, FirstName, LastName, DateOfBirth, Adress, Phone, JMBG, Note) VALUES (NEXTVAL('patient_seq'), 'Sofija', 'Rabrenovic','1951-09-19', 'Mileve Maric 4', '0641478653', '181199579501', 'Cave penicillini');



INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Karijes');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Zub u nicanju');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Krunica');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Mlecni zub');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Implant');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Viners');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Karijes profunda');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Konus krunica');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Clan mosta');
INSERT INTO ToothStatus (ToothStatusID, StatusName) VALUES (NEXTVAL('tooth_status_seq'), 'Zub u protezi');



INSERT INTO Diagnosis (DiagnosisID, NameOfDiagnosis, Therapy) VALUES (NEXTVAL('diagnosis_seq'), 'Pulpitis', 'Lecenje korena');
INSERT INTO Diagnosis (DiagnosisID, NameOfDiagnosis, Therapy) VALUES (NEXTVAL('diagnosis_seq'), 'Giningivitis', 'Penincilin VK');
INSERT INTO Diagnosis (DiagnosisID, NameOfDiagnosis, Therapy) VALUES (NEXTVAL('diagnosis_seq'), 'Karijes', 'Nanosenje florida');
INSERT INTO Diagnosis (DiagnosisID, NameOfDiagnosis, Therapy) VALUES (NEXTVAL('diagnosis_seq'), 'Parodontis', 'Tetraciklin');


INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Milica', 'Arsovic','1994-09-19', 'Danila Kisa 19', '0641234569', 'milica@gmail.com', 1);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Jovana', 'Sljivic','1995-09-19', 'Bulevar Oslobodjenja 19', '0641234569', 'jovana@gmail.com', 2);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Marko', 'Markovic','1995-09-19', 'Gajeva 5', '0641234569', 'marko@gmail.com', 3);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Marijana', 'Simovic','1995-09-19', 'Antona Cehova 23', '0641234569', 'marijana@gmail.com', 4);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Veljko', 'Popovic','1995-09-19', 'Ive Andrica 2', '0641234569', 'veljko@gmail.com', 5);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Masa', 'Radovic','1995-09-19', '1300 kaplara', '0641234569', 'masa@gmail.com', 1);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Magdalena', 'Marjanovic','1995-09-19', 'Sarajevska 5', '0641234569', 'magdakena@gmail.com', 2);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Tara', 'Djordjevic','1995-09-19', 'Vojvodjanska 5', '0641234569', 'tara@gmail.com', 3);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Aco', 'Markovic','1995-09-19', 'Zeleznicka 5', '0641234569', 'aco@gmail.com', 4);
INSERT INTO Employed (EmployedID, FirstName, LastName, DateOfBirth, Adress, Phone, Email, SpecialtyID) VALUES (NEXTVAL('patient_seq'), 'Dusica', 'Komnenovic','1995-09-19', 'Radnicka 5', '0641234569', 'dusica@gmail.com', 5);


INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 10, 1,1);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 20, 2,2);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 5, 11,3);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 32, 12,4);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 12, 13,5);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 8, 14,6);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 7, 15,7);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 11, 16,8);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 21, 17,9);
INSERT INTO Tooth (ToothID, RegNumOfTeeth, PatientID, ToothStatusID) VALUES (NEXTVAL('tooth_seq'), 13, 18,10);


INSERT INTO PerformedService (PerformedServiceID, NameOfService, DateOfService ,Paid, PatientID, EmployedID, TypeOfServiceID, WorkplaceID, MaterialID, DiagnosisID) VALUES (NEXTVAL('performed_service_seq'), 'Implant proteza','2019-09-20',true, 1, 3, 2, 1, 1, 1);
INSERT INTO PerformedService (PerformedServiceID, NameOfService, DateOfService ,Paid, PatientID, EmployedID, TypeOfServiceID, WorkplaceID, MaterialID, DiagnosisID) VALUES (NEXTVAL('performed_service_seq'), 'Hirurska ekstrakcija zuba','2019-07-25',true, 2, 4, 1, 1, 2, 1);

