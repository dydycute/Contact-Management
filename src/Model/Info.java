
package Model;

/**
 *
 * @author CHUCDY
 */
public class Info {
    int ID;
    String name;
    String group;
    String address;
    String phone;
    String fname;
    String lname;
    public Info(){
        
    }

    public Info(int ID, String name, String group, String address, String phone, String fname, String lname) {
        this.ID = ID;
        this.name = name;
        this.group = group;
        this.address = address;
        this.phone = phone;
        this.fname = fname;
        this.lname = lname;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    @Override
    public String toString() {
        return "Info{" + "ID=" + ID + ", name=" + name + ", group=" + group + ", address=" + address + ", phone=" + phone + ", fname=" + fname + ", lname=" + lname + '}';
    }
   
}
