package Model.Data.DAO;

import Model.Inmuebles;
import org.jooq.*;
import org.jooq.Record;

import java.util.ArrayList;
import java.util.List;

import static org.jooq.impl.DSL.name;
import static org.jooq.impl.DSL.table;

public class InmueblesDAO {
    public static void agregarInm(DSLContext query, Inmuebles inmuebles){
        Table tablaInm = table(name("inmuebles"));
        Field[] columnas = tablaInm.fields("id_inmueble","tipoConstruccion","ciudad","direccion","precio");
        query.insertInto(tablaInm, columnas[0],columnas[1],columnas[2],columnas[3],columnas[4])
                .values(inmuebles.---(), inmuebles.get--(), inmuebles.get--, inmuebles.get---, inmuebles.get--)
                .execute();
    }
    public static void eliminarEstudiante(DSLContext query, String rut){
        Table tablaEstudiante= table(name("Usuario"));
        query.delete(DSL.table("Usuario")).where(DSL.field("rut").eq(rut)).execute();
    }

    public static List<Inmuebles> obtenerInmuebles(DSLContext query) {
        List<Inmuebles> inmuebles = new ArrayList<>();

        // Obtener los datos de la tabla de categorías
        Result<Record> result = query.select().from(table(name("inmuebles"))).fetch();

        // Recorrer los registros y crear objetos Categoria
        for (Record record : result) {
            int id_inmueble = record.get("id_inmueble", Integer.class);
            String nombre = record.get("nombre", String.class);

            Inmuebles inmuebles1 = new Inmuebles(id_inmueble, nombre);
            inmuebles.add(inmuebles1);
        }

        return inmuebles;
    }
}
