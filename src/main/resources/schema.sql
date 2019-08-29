CREATE TABLE employee (
  id INTEGER PRIMARY KEY,
  name VARCHAR(64) NOT NULL,
  age   int(4) NOT NULL
);

CREATE TABLE parkingLot (
  parkingLotID INTEGER PRIMARY KEY,
  availablePositionCount INTEGER NOT NULL,
  totalCount   INTEGER NOT NULL
);