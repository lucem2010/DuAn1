package DAO;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.List;

import DTO.CuaHang;

public class DaoLoaiHang {
    Context context;

    public DaoLoaiHang(Context context) {
        this.context = context;
    }

    String [] dsLoaiHang={"Tất cả","MacBook","Lenovo","Asus","Dell","HP",
            "Acer","MSI","Razer","Microsoft","Samsung"};
    public void Adapter(Spinner spinner) {

        ArrayAdapter<String> adapter = new ArrayAdapter<>(context, android.R.layout.simple_spinner_item, dsLoaiHang);
        spinner.setAdapter(adapter);

    }
    public String [] getDsLoaiHang(){
        return dsLoaiHang;
    }

}
