class Student {
	String index;
	String firstName;
	String lastName;
	List <Integer> grades = new ArrayList<>();

	//TODO constructor

	public Student(String index, String firstName, String lastName, List<Integer> grades) {
		this.index = index;
		this.firstName = firstName;
		this.lastName = lastName;
		this.grades = grades;
	}


	//TODO seters & getters


	public String getIndex() {
		return index;
	}

	public void setIndex(String index) {
		this.index = index;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	public void setGrades(List<Integer> grades) {
		this.grades = grades;
	}

	public double getAverage() {
		//TODO
		int sum=0;
		for (int i=0; i<grades.size();i++){
			sum+=grades.get(i);
		}
		double avg= sum/grades.size();
		return avg;

	}

	public int ECTSCredits() {
		//TODO
	}
}
