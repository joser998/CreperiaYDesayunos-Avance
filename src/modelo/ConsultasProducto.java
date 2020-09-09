package modelo;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ConsultasProducto extends Conexion{
	PreparedStatement ps; 
    ResultSet rs; 
    
    
    
    /*  Tabla Categoria */
    public boolean insertarCategoria(ProductoCategoria producto) {
    	Connection conexion = getConnection();
    	
    	try{
            ps = conexion.prepareStatement("insert into categoria (categoria, descripcion) values (?,?)");
            ps.setString(1, producto.getCategoria());
            ps.setString(2, producto.getDescripcion());
           
            int resultado = ps.executeUpdate(); 
            
           
            if(resultado > 0){
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error: "+ex);
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al cerrar Conexion: "+ex);
            }
        }
    	
    } // *************************************************
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public boolean insertar(ProductoCategoria producto){
        Connection conexion = getConnection();
    
    try{
        ps = conexion.prepareStatement("insert into producto (platillo, codigo, precio, cantidad, ingredientes, codigoCategoria) values (?,?,?,?,?,?)");
        ps.setString(1, producto.getPlatillo());
        ps.setString(2, producto.getCodigo());
        ps.setString(3, producto.getPrecio());
        ps.setString(4, producto.getCantidad());
        ps.setString(5, producto.getIngredientes());
        ps.setInt(6, producto.getCodigoCategoria());
        
       
        int resultado = ps.executeUpdate(); 
        
       
        if(resultado > 0){
            return true;
        }else{
            return false;
        }
        
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null, "Error: "+ex);
        return false;
    }finally{
        try{
            conexion.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al cerrar Conexion: "+ex);
        }
    }
}
    
    
    
    
    
    
    
    
    
    public boolean buscar(ProductoCategoria producto){
       
        Connection conexion = getConnection(); 
        
        
        try{
            ps = conexion.prepareStatement("select * from producto where codigo=?");
            ps.setString(1, producto.getCodigo());
            rs = ps.executeQuery(); 
            
            
            if(rs.next() == true){
            	producto.setIdProducto(rs.getInt("idProducto"));
            	producto.setPlatillo(rs.getString("platillo"));
            	producto.setCodigo(rs.getString("codigo"));
            	producto.setPrecio(rs.getString("precio"));
            	producto.setCantidad(rs.getString("cantidad"));
            	producto.setIngredientes(rs.getString("ingredientes"));
            	producto.setCodigoCategoria(Integer.parseInt(rs.getString("codigoCategoria")));
                  
              
                return true;
                
            }else{
                return false;
            }
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: "+ex);
            
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al cerrar Conexion: "+ex);
            }
        }
    }
    
    
    
    public boolean modificar(ProductoCategoria producto){
       
        Connection conexion = getConnection(); 
       
        try{
            ps = conexion.prepareStatement("update producto set platillo=?, codigo=?, precio=?, cantidad=?, ingredientes=?, codigoCategoria=? where idProducto=?");
            ps.setString(1, producto.getPlatillo());
            ps.setString(2, producto.getCodigo());
            ps.setString(3, producto.getPrecio());
            ps.setString(4, producto.getCantidad());
            ps.setString(5, producto.getIngredientes());
            ps.setInt(6, producto.getCodigoCategoria());
            ps.setInt(7, producto.getIdProducto());
            
                    
            int resultado = ps.executeUpdate(); 
            
            
            if(resultado > 0){
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: "+ex);
            
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al cerrar Conexion: "+ex);
            }
        }
    }
    
    
    
    public boolean eliminar(ProductoCategoria producto){
       
        Connection conexion = getConnection(); 
        
        
        try{
            
            ps = conexion.prepareStatement("delete from producto where idProducto=?");
            ps.setInt(1, producto.getIdProducto());
                    
            int resultado = ps.executeUpdate(); 
            
            
            if(resultado > 0){
                return true;
            }else{
                return false;
            }
            
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "Error: "+ex);
            
            return false;
        }finally{
            try{
                conexion.close();
            }catch(Exception ex){
                JOptionPane.showMessageDialog(null, "Error al cerrar Conexion: "+ex);
            }
        }
    }
    
}