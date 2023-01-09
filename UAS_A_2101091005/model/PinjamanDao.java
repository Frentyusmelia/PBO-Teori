/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UAS_A_2101091005.model;
import java.util.List;

/**
 *
 * @author ACER
 */
public interface PinjamanDao {
    void save(Pinjaman pinjaman);
    void update(int index, Pinjaman pinjaman);
    void delete (int index);
    Pinjaman getPinjaman(int index);
    List<Pinjaman> getAllPinjaman();
}
