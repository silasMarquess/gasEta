package devandroid.silas.appgaseta.DAO;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class GasEtaDB extends SQLiteOpenHelper {

    public static final String DB_NAME = "gaseta.db";
    public static final int DB_VERSION = 1;

    Cursor curso;

    SQLiteDatabase db;


    public GasEtaDB(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "create table tb_combustivel(" +
                "id integer not null primary key autoincrement, " +
                "nomeCombustivel TEXT, " +// O tipo "TEXT" é equivalente ao tipo "VARCHAR" do Mysql
                "valCombustivel REAL, " + // O tipo "REAL" é equivalente ao tipo "DOUBLE ou FLOAT ou DECIMAL"
                "recomendacoes TEXT)";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
