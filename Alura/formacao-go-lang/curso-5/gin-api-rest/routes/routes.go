package routes

import (
	"github.com/gin-gonic/gin"
	"github.com/matheuspsantos/api-go-gin/controllers"
)

func HandleRequests() {
	r := gin.Default()
	r.GET("/alunos", controllers.ListAllAlumns)

	r.POST("/alunos", controllers.Create)
	r.GET("/alunos/:id", controllers.Find)
	r.DELETE("/alunos/:id", controllers.Delete)
	r.PATCH("/alunos/:id", controllers.Edit)
	r.GET("/alunos/cpf/:cpf", controllers.FindByCpf)
	r.Run()

}
