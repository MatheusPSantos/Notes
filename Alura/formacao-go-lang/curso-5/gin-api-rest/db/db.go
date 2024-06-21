package db

import (
	"log"

	"github.com/matheuspsantos/api-go-gin/models"
	"gorm.io/driver/postgres"
	"gorm.io/gorm"
)

var (
	DB  *gorm.DB
	err error
)

func ConnectDatabase() {
	log.Println("Connecting with database...")
	strConn := "host=localhost user=root password=root dbname=root port=5433 sslmode=disable"

	DB, err = gorm.Open(postgres.Open(strConn))

	if err != nil {
		log.Panic("Connection with database was failed. Err: ", err.Error())
	}

	DB.AutoMigrate(&models.Aluno{})
}
