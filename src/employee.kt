//Construct the employee object
class employee constructor(name: String,
                           idNumber: Int,
                           shiftNumber: Int){
    //Creating all Getter and Setter methods
    var name: String = name
        get() = field
        set(value) {
            field = value
        }
    var idNumber: Int = idNumber
        get() = field
        set(value) {
            field = value
        }
    var shiftNumber: Int = shiftNumber
        get() = field
        set(value) {
            field = value
        }

    //default message for employee creation
    init {
        println("New Employee Added: $name ")
    }

    //Prints out all employee information
    fun printEmployeeInfo(){
        println("Name: $name\n" +
                "ID Number: $idNumber\n" +
                "Shift: $shiftNumber\n")
    }




}