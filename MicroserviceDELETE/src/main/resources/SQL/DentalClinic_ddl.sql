DROP TABLE IF EXISTS Workplace CASCADE;
DROP TABLE IF EXISTS Material CASCADE;
DROP TABLE IF EXISTS TypeOfService CASCADE;
DROP TABLE IF EXISTS Specialty CASCADE;
DROP TABLE IF EXISTS Patient CASCADE;
DROP TABLE IF EXISTS ToothStatus CASCADE;
DROP TABLE IF EXISTS Diagnosis CASCADE;
DROP TABLE IF EXISTS Employed CASCADE;
DROP TABLE IF EXISTS Tooth CASCADE;
DROP TABLE IF EXISTS PerformedService CASCADE;

DROP SEQUENCE IF EXISTS workplace_seq CASCADE;
DROP SEQUENCE IF EXISTS material_seq CASCADE;
DROP SEQUENCE IF EXISTS type_of_service_seq CASCADE;
DROP SEQUENCE IF EXISTS specialty_seq CASCADE;
DROP SEQUENCE IF EXISTS patient_seq CASCADE;
DROP SEQUENCE IF EXISTS tooth_status_seq CASCADE;
DROP SEQUENCE IF EXISTS diagnosis_seq CASCADE;
DROP SEQUENCE IF EXISTS employed_seq CASCADE;
DROP SEQUENCE IF EXISTS tooth_seq CASCADE;
DROP SEQUENCE IF EXISTS performed_service_seq CASCADE;


CREATE TABLE Workplace (
  WorkplaceID INT NOT NULL,
  NameOfWorkplace VARCHAR(30) ,
  Adress VARCHAR(50),
  Phone VARCHAR (30),

  CONSTRAINT PK_Workplace PRIMARY KEY (WorkplaceID)
);

CREATE TABLE Material (
  MaterialID INT NOT NULL,
  NameOfMaterial VARCHAR(30) ,
  ManufacturedName VARCHAR(50),
  Quantity NUMERIC(10,2),

  CONSTRAINT PK_Material PRIMARY KEY (MaterialID)
);

CREATE TABLE TypeOfService (
  TypeOfServiceID INT NOT NULL,
  NameOfTypeService VARCHAR(30) ,
  Price NUMERIC(10,2),

  CONSTRAINT PK_TypeOfService PRIMARY KEY (TypeOfServiceID)
);

CREATE TABLE Specialty (
  SpecialtyID INT NOT NULL,
  NameOfSpecialty VARCHAR(30) ,
  AcademicTitle VARCHAR(50),

  CONSTRAINT PK_Specialty PRIMARY KEY (SpecialtyID)
);

CREATE TABLE Patient (
  PatientID INT NOT NULL,
  FirstName VARCHAR(30),
  LastName VARCHAR(30),
  DateOfBirth Date,
  Adress VARCHAR(30),
  Phone VARCHAR (30),
  JMBG VARCHAR (13),
  Note VARCHAR (50),

  CONSTRAINT PK_Patient PRIMARY KEY (PatientID)
);


CREATE TABLE ToothStatus (
  ToothStatusID INT NOT NULL,
  StatusName VARCHAR(50),

  CONSTRAINT PK_ToothStatus PRIMARY KEY (ToothStatusID)
);

CREATE TABLE Diagnosis (
  DiagnosisID INT NOT NULL,
  NameOfDiagnosis VARCHAR(30) ,
  Therapy VARCHAR(100),

  CONSTRAINT PK_Diagnosis PRIMARY KEY (DiagnosisID)
);

CREATE TABLE Employed (
  EmployedID INT NOT NULL,
  FirstName VARCHAR(30),
  LastName VARCHAR(30),
  DateOfBirth Date,
  Adress VARCHAR(30),
  Phone VARCHAR (30),
  Email VARCHAR (50),
  SpecialtyID INT NOT NULL,

  CONSTRAINT PK_Employed PRIMARY KEY (EmployedID),
  CONSTRAINT FK_Employed_Specialty FOREIGN KEY (SpecialtyID) REFERENCES Specialty (SpecialtyID)
);


CREATE TABLE Tooth (
  ToothID INT NOT NULL,
  RegNumOfTeeth VARCHAR(30),
  PatientID INT NOT NULL,
  ToothStatusID INT NOT NULL,

  CONSTRAINT PK_Tooth PRIMARY KEY (ToothID),
  CONSTRAINT FK_Tooth_Patient FOREIGN KEY (PatientID) REFERENCES Patient (PatientID),
  CONSTRAINT FK_Tooth_ToothStatus FOREIGN KEY (ToothStatusID) REFERENCES ToothStatus (ToothStatusID)
);


CREATE TABLE PerformedService (
  PerformedServiceID INT NOT NULL,
  NameOfService VARCHAR(30),
  DateOfService Date,
  Paid BOOLEAN,
  PatientID INT NOT NULL,
  EmployedID INT NOT NULL,
  TypeOfServiceID INT NOT NULL,
  WorkplaceID INT NOT NULL,
  MaterialID INT NOT NULL,
  DiagnosisID INT NOT NULL,

  CONSTRAINT PK_PerformedService PRIMARY KEY (PErformedServiceID),
  CONSTRAINT FK_PerformedService_Patient FOREIGN KEY (PatientID) REFERENCES Patient (PatientID),
  CONSTRAINT FK_PerformedService_Employed FOREIGN KEY (EmployedID) REFERENCES Employed (EmployedID),
  CONSTRAINT FK_PerformedService_TypeOfService FOREIGN KEY (TypeOfServiceID) REFERENCES TypeOfService (TypeOfServiceID),
  CONSTRAINT FK_PerformedService_Workplace FOREIGN KEY (WorkplaceID) REFERENCES Workplace (WorkplaceID),
  CONSTRAINT FK_PerformedService_Material FOREIGN KEY (MaterialID) REFERENCES Material (MaterialID),
  CONSTRAINT FK_PerformedService_Diagnosis FOREIGN KEY (DiagnosisID) REFERENCES Diagnosis (DiagnosisID)
);


CREATE SEQUENCE workplace_seq
  INCREMENT 1;
CREATE SEQUENCE material_seq
  INCREMENT 1;
CREATE SEQUENCE type_of_service_seq
  INCREMENT 1;
CREATE SEQUENCE specialty_seq
  INCREMENT 1;
CREATE SEQUENCE patient_seq
  INCREMENT 1;
CREATE SEQUENCE tooth_status_seq
  INCREMENT 1;
CREATE SEQUENCE diagnosis_seq
  INCREMENT 1;
CREATE SEQUENCE employed_seq
  INCREMENT 1;
CREATE SEQUENCE tooth_seq
  INCREMENT 1;
CREATE SEQUENCE performed_service_seq
  INCREMENT 1;
