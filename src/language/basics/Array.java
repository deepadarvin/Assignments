package language.basics;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 3D Array: [Semester][Subject][Details]
        String[][][] data = {
            {   // Semester 1
                {"Mathematics I", "Pass(78)"},
                {"Physics", "Pass(85)"},
                {"Chemistry", "Fail(21)"},
                {"Computer Programming", "Pass(74)"},
                {"Engineering Drawing", "Pass(88)"},
                {"Basic Electrical Eng.", "Pass(79)"}
            },
            {   // Semester 2
                {"Mathematics II", "Pass(82)"},
                {"Mechanics", "Pass(77)"},
                {"Environmental Sci.", "Pass(93)"},
                {"Basic Electronics", "Fail(19)"},
                {"Engineering Physics", "Fail(24)"},
                {"Engineering Graphics", "Pass(90)"}
            },
            {   // Semester 3
                {"Data Structures", "Pass(88)"},
                {"Discrete Mathematics", "Pass(81)"},
                {"Digital Electronics", "Pass(76)"},
                {"Operating Systems", "Fail(32)"},
                {"Signals and Systems", "Pass(85)"},
                {"Object-Oriented Prog.", "Pass(78)"}
            },
            {   // Semester 4
                {"Algorithms", "Pass(91)"},
                {"Computer Networks", "Pass(73)"},
                {"Database Systems", "Fail(19)"},
                {"Microprocessors", "Pass(80)"},
                {"Communication Eng.", "Pass(76)"},
                {"Software Engineering", "Pass(87)"}
            },
            {   // Semester 5
                {"Probability & Stats", "Pass(86)"},
                {"Machine Learning", "Pass(88)"},
                {"Compiler Design", "Pass(84)"},
                {"Theory of Computation", "Pass(95)"},
                {"Embedded Systems", "Pass(73)"},
                {"Computer Graphics", "Pass(90)"}
            }
        };

	


        // 🔹 Print Semester 2 (index 1) - Subject 4 and 5 names
        System.out.println("Semester 2, Subject 4: " + data[1][3][0]);
        System.out.println("Semester 2, Subject 5: " + data[1][4][0]);

        // 🔹 Print Status/Marks of Semester 4 (index 3) - Subject 3 and 6
        System.out.println("Semester 4, Subject 3 Status: " + data[3][2][1]);
        System.out.println("Semester 4, Subject 6 Status: " + data[3][5][1]);
    }
}