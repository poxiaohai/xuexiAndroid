package com.example.cheng.GreenDao;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by cheng on 2018/5/16.
 */
@Entity
public class User {
        @Id(autoincrement = true)
        private Long id;
        private String name;
        private String age;
        private String sex;
        private String salary;
        @Generated(hash = 1281958717)
        public User(Long id, String name, String age, String sex, String salary) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.salary = salary;
        }
        @Generated(hash = 586692638)
        public User() {
        }
        public Long getId() {
            return this.id;
        }
        public void setId(Long id) {
            this.id = id;
        }
        public String getName() {
            return this.name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getAge() {
            return this.age;
        }
        public void setAge(String age) {
            this.age = age;
        }
        public String getSex() {
            return this.sex;
        }
        public void setSex(String sex) {
            this.sex = sex;
        }
        public String getSalary() {
            return this.salary;
        }
        public void setSalary(String salary) {
            this.salary = salary;
        }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }
}
