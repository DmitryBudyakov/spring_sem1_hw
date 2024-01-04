package spring.sem1.hw;

import com.google.gson.annotations.SerializedName;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Person {
    @SerializedName("First name")
    private String firstName;

    @SerializedName("Last name")
    private String lastName;

    @SerializedName("Age")
    private int age;

    public Person() {
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /**
     * Метод toString сгенерированный с помощью ToStringBuilder из common-lang3
     * @return
     */
    public String toString(){
        return new ToStringBuilder(this)
                .append("First name:", firstName)
                .append("Last name:", lastName)
                .append("Age:", age)
                .toString();
    }

    /**
     * Метод hashCode сгенерированный с помощью HashCodeBuilder из common-lang3
     * @return
     */
    public int hashCode(){
        return new HashCodeBuilder(17,37)
                .append(firstName)
                .append(lastName)
                .append(age)
                .toHashCode();
    }

    /**
     * Метод equals сгенерированный с помощью EqualsBuilder из common-lang3
     * @param obj
     * @return
     */
    public boolean equals(Object obj) {
        if (obj == null) { return false; }
        if (obj == this) { return true; }
        if (obj.getClass() != getClass()) {
            return false;
        }
        Person person = (Person) obj;
        return new EqualsBuilder()
                .append(age, person.age)
                .isEquals();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
