package com.example.tugasakhir2.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
public class RekomendasiLaptop {

        private Integer id;

        @SerializedName("company")
        @Expose
        private String company;

        @SerializedName("product")
        @Expose
        private String product;

        @SerializedName("typename")
        @Expose
        private String typename;

        @SerializedName("inches")
        @Expose
        private  String inches;

        @SerializedName("screenresolution")
        @Expose
        private String screenresolution;

        @SerializedName("cpu")
        @Expose
        private String cpu;

        @SerializedName("ram")
        @Expose
        private String ram;

        @SerializedName("memory")
        @Expose
        private String memory;

        @SerializedName("gpu")
        @Expose
        private String gpu;

        @SerializedName("opsis")
        @Expose
        private String opsis;

        @SerializedName("weight")
        @Expose
        private String weight;

        public RekomendasiLaptop(Integer id, String company,
                                 String product, String typename, String inches,
                                 String screenresolution, String cpu, String ram, String memory,
                                 String gpu, String opsis, String weight){
                this.id = id;
                this.company = company;
                this.product = product;
                this.typename = typename;
                this.inches = inches;
                this.screenresolution = screenresolution;
                this.cpu = cpu;
                this.ram = ram;
                this.memory = memory;
                this.opsis = opsis;
                this.weight = weight;
        }

        public Integer getId() {
            return id;
        }

        public String getCompany() {
            return company;
        }

        public String getProduct() {
            return product;
        }

        public String getTypename() {
            return typename;
        }

        public String getInches() {
            return inches;
        }

        public String getScreenResolution() {
            return screenresolution;
        }

        public String getCpu() {
            return cpu;
        }

        public String getRam() {
            return ram;
        }

        public String getMemory() {
            return memory;
        }

        public String getGpu() {
            return gpu;
        }

        public String getOpsis() {
            return opsis;
        }

        public String getWeight() {
            return weight;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public void setCompany(String company) {
                this.company = company;
        }

        public void setProduct(String product) {
                this.product = product;
        }

        public void setTypename(String typename) {
                this.typename = typename;
        }

        public void setInches(String inches) {
                this.inches = inches;
        }

        public void setScreenresolution(String screenresolution) {
                this.screenresolution = screenresolution;
        }

        public void setCpu(String cpu) {
                this.cpu = cpu;
        }

        public void setRam(String ram) {
                this.ram = ram;
        }

        public void setMemory(String memory) {
                this.memory = memory;
        }

        public void setGpu(String gpu) {
                this.gpu = gpu;
        }

        public void setOpsis(String opsis) {
                this.opsis = opsis;
        }

        public void setWeight(String weight) {
                this.weight = weight;
        }
}
