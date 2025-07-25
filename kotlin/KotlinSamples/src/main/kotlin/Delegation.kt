package br.com.matheuspsantos

import kotlin.reflect.KProperty

class Delegate1 {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "${thisRef}, thank you for delegating ''${property.name} to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

// class delegation
interface IPrinter {
    fun print()
}

interface IScanner {
    fun scan()
}

class Printer : IPrinter {
    override fun print() {
        println("Printing a document")
    }
}

class Scanner : IScanner {
    override fun scan() {
        println("Scanning a document")
    }
}
// Sem delegation
//class MultiFunctionDevice : IPrinter, IScanner {
//    val printer = Printer()
//    val scanner = Scanner()
//
//    override fun print() {
//        printer.print()
//    }
//
//    override fun scan() {
//        scanner.scan()
//    }
//}

class MultiFunctionDevice(
    printer: IPrinter = Printer(),
    scanner: IScanner = Scanner()
) : IPrinter by printer,
    IScanner by scanner {}

