class Feature {
    List <Student> students = new ArrayList<>();
    String name;

    public Feature(List<Student> studens, String name) {
        this.studens = studens;
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void delete(Student s) {
        students.remove(s);
    }
}