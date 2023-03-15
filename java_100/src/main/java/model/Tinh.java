
package model;

import java.util.Objects;


public class Tinh {
    private int maTinh;
    private String tenTinh;

    public Tinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }
    
    public Tinh(int maTinh, String tenTinh) {
        this.maTinh = maTinh;
        this.tenTinh = tenTinh;
    }

    public int getMaTinh() {
        return maTinh;
    }

    public void setMaTinh(int maTinh) {
        this.maTinh = maTinh;
    }

    public String getTenTinh() {
        return tenTinh;
    }

    public void setTenTinh(String tenTinh) {
        this.tenTinh = tenTinh;
    }
    

    @Override
    public String toString() {
        return "Tinh{" + "maTinh=" + maTinh + ", tenTinh=" + tenTinh + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + this.maTinh;
        hash = 37 * hash + Objects.hashCode(this.tenTinh);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tinh other = (Tinh) obj;
        if (this.maTinh != other.maTinh) {
            return false;
        }
        return Objects.equals(this.tenTinh, other.tenTinh);
    }
    
}
