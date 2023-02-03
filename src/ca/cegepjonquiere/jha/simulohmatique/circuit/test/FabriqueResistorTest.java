package ca.cegepjonquiere.jha.simulohmatique.circuit.test;

import ca.cegepjonquiere.jha.simulohmatique.circuit.FabriqueResistor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabriqueResistorTest {

    @Test
    void fromCodeQuatreResistance() {
        assertEquals(270, FabriqueResistor.fabriquerResistor("RMBo").getResistance());
        assertEquals(1200000, FabriqueResistor.fabriquerResistor("BRVo").getResistance());
    }

    @Test
    void fromCodeCinqResistance() {
        assertEquals(270_000_000_000L, FabriqueResistor.fabriquerResistor("RMNLA").getResistance());
        assertEquals(100000, FabriqueResistor.fabriquerResistor("BNNOb").getResistance());
        assertEquals(274, FabriqueResistor.fabriquerResistor("RMJNR").getResistance());
        assertEquals(10000, FabriqueResistor.fabriquerResistor("BNNRG").getResistance());
        assertEquals(35.2, FabriqueResistor.fabriquerResistor("OVRoo").getResistance());
    }

    @Test
    void fromCodeQuatreTolerance() {
        assertEquals(0.05, FabriqueResistor.fabriquerResistor("RMBo").getTolerance());
    }

    @Test
    void fromCodeCinqTolerance() {
        assertEquals(0.10, FabriqueResistor.fabriquerResistor("RMNNA").getTolerance());
    }
    @Test
    void fromCodeInvalid() {
        assertNull(FabriqueResistor.fabriquerResistor(""));
        assertNull(FabriqueResistor.fabriquerResistor("NoNono"));
        assertNull(FabriqueResistor.fabriquerResistor("XRMJNR"));
        assertNull(FabriqueResistor.fabriquerResistor("RMJNRX"));
        assertNull(FabriqueResistor.fabriquerResistor("oBbo"));
        assertNull(FabriqueResistor.fabriquerResistor("XZXZZ"));
        assertNull(FabriqueResistor.fabriquerResistor("RMNNL"));
    }
}