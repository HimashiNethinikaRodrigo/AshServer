package edu.uom.enex.server.modle;

/**
 * Created by Himashi Nethinika on 5/20/2016.
 */
public class UserModel {


        private String userId;
        private String userName;
        private int privilege;
        private String name;
        private String address;
        private String contactNo;

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public int getPrivilege() {
            return privilege;
        }

        public void setPrivilege(int privilege) {
            this.privilege = privilege;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getContactNo() {
            return contactNo;
        }

        public void setContactNo(String contactNo) {
            this.contactNo = contactNo;
        }

        @Override
        public String toString() {
            return "UserModel{" +
                    "userId='" + userId + '\'' +
                    ", userName='" + userName + '\'' +
                    ", privilege='" + privilege + '\'' +
                    ", name='" + name + '\'' +
                    ", address='" + address + '\'' +
                    ", contactNo=" + contactNo +
                    '}';
        }


}
