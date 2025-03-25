package assignments;

public class Assignment2_Array {

	public static void main(String[] args)

	{
		String[][][] Semesters = { {
			{ "Mathematics", "chemistry", "computer programming", "Engineering drawing", "basic electrical eng" },
			{ "78", "85", "91", "74", "88", "79" } },
				// semester 2
				{ { "Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics",
				"Engineering Graphics" }, { "82", "77", "93", "69", "84", "90" } },

				{ // Semester 3
					{ "Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems",
						"Signals and Systems", "Object-Oriented Prog." },
					{ "88", "81", "76", "92", "85", "78" } },
				{ // Semester 4
						{ "Algorithms", "Computer Networks", "Database Systems", "Microprocessors",
							"Communication Eng.", "Software Engineering" },
						{ "91", "73", "89", "80", "76", "87" } },
				{ // Semester 5
							{ "Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation",
								"Embedded Systems", "Computer Graphics" },
							{ "86", "88", "84", "95", "73", "90" } } };

		System.out.println(Semesters[2][0][3]);// semester 3 subject 4
		System.out.println(Semesters[2][0][4]);// semester 3 subject 5

		System.out.println(Semesters[4][1][2]);// semester 5 subjest 3 marks
		System.out.println(Semesters[4][1][5]);// semester 5 subjest 3 marks

	}

}
