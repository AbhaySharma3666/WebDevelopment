class Student {
    // Properties
    name;
    age;
    #rollNo;  // private property
    #marks;   // private property

    // Constructor
    constructor(studentName, studentAge, roll, studentMarks) {
        this.name = studentName;
        this.age = studentAge; 
        this.#rollNo = roll;
        this.#marks = studentMarks;
    }

    // Getter methods for private properties
    get getRollNo() {
        return this.#rollNo;
    }

    get getMarks() {
        return this.#marks;
    }

    // Setter methods for private properties
    set setRollNo(roll) {
        this.#rollNo = roll;
    }

    set setMarks(marks) {
        this.#marks = marks;
    }

    // Method to display student info
    displayInfo() {
        console.log(`
            Name: ${this.name}
            Age: ${this.age}
            Roll No: ${this.#rollNo}
            Marks: ${this.#marks}
        `);
    }
}

// Creating student object
let student1 = new Student("John", 20, 101, 85);
student1.displayInfo();

// Accessing private property through getter
console.log(student1.getRollNo);
console.log(student1.getMarks);

// Modifying private property through setter
student1.setRollNo = 102;
student1.setMarks = 90;
student1.displayInfo();
