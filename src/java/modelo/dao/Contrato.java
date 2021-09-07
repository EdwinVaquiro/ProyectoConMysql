/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.dao;

import java.util.List;

/**
 *
 * @author Edwin Sandoval
 */
public interface Contrato <Generico>
{
    boolean create(Generico ob);
    public List<Generico> readAll();
    public Generico read(Generico filter);
    public boolean update(Generico ob);
    public boolean Delete(Generico ob);
    
}
