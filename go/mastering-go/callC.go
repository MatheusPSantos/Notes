package main

// #cgo CFLAGS: -I${SRCDIR}
// #cgo LDFLAGS: ${SRCDIR}/callC.a
// #include <stdlib.h>
// #include <callC.h>

import "C"
import (
	"fmt"
	"unsafe"
)

func main() {
	fmt.Println("Going to call C function")
	C.cHello()

	fmt.Println("Gointo to call another C function!")

	myMessage := C.CString("This is golang!")
	defer C.free(unsafe.Pointer(myMessage))
	C.printMessage(myMessage)

	fmt.Println("All perfectly done!")
}
