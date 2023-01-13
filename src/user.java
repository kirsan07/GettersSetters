class user {
    String firstName;
    String lastName;

    public void User(){
        this.firstName="";
        this.lastName="";
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullname() {
        String sentence="";
        if(this.firstName!="" && this.lastName!=""){
            sentence=this.firstName+" "+this.lastName;
        }
        else if (this.firstName!=""&&this.lastName==""){
        sentence = this.firstName;
        }
        else {
           sentence = "Неизвестно";
        }
        return sentence;

    }

    }

