package main

import (
	"fmt"
	"log"
	"log/syslog"
)

func main() {
	sysLog, err := syslog.New(syslog.LOG_ALERT|syslog.LOG_MAIL, "some Program")

	if err != nil {
		log.Fatal(err)
	} else {
		log.SetOutput(sysLog)
	}

	log.Fatal(sysLog)
	fmt.Println("Will you see this?")

}
