package org.example.service;

import org.example.model.LineaPedido;
import org.example.model.Pedido;



import java.util.ArrayList;
import java.util.List;
import org.example.dao.PedidoJpaController;

public class PedidoService {
    private PedidoJpaController pedidoJpaController;

    private Pedido pedido;

    public PedidoService( PedidoJpaController pedidoJpaController) {
        this.pedidoJpaController = pedidoJpaController;
    }

    public void crearPedido(Pedido pedido) {
            pedidoJpaController.crearPedido(pedido);
    }

//    public List<Pedido> obtenerTodosLosPedidos() {
//        List<Pedido> pedidosEncontrados = new ArrayList<>();
//        for (Pedido pedido: pedidoRepository.obtenerTodosLosPedidos()
//             ) {
//            pedidosEncontrados.add(pedido);
//        }
//        return pedidosEncontrados;
//    }
//
//    public void agregarLineaDePedido(Pedido pedido, LineaPedido lineaPedido) {
//        pedidoRepository.crearLineaPedido(pedido,lineaPedido);
//    }
//
//
//    public Pedido buscarPedidoPorNumero(String numero) {
//        Pedido pedido = pedidoRepository.buscarPedidoPorNumero(numero);
//        if (pedido == null) {
//            return null;
//        } else {
//            return pedido;
//        }
//    }
//
//    public void procesarPedido(String numero, String cuitEmpleado){
//            pedidoRepository.procesarPedido(numero, cuitEmpleado);
//    }
//
//    public void completarPedido(String numero){
//        pedidoRepository.completarPedido(numero);
//    }
//
//    public void enviarADespacho(String numero) {
//        Pedido pedidoEncontrado = pedidoRepository.buscarPedidoPorNumero(numero);
//        if (pedidoEncontrado != null) {
//            pedidoRepository.enviarADespacho(numero);
//        }
//    }
//
//    public void despacharPedido(String numero) {
//        Pedido pedidoEncontrado = pedidoRepository.buscarPedidoPorNumero(numero);
//        if (pedidoEncontrado != null) {
//            pedidoRepository.despacharPedido(numero);
//
//        }
//    }
//
//    public void enviarAEntrega(String numero, String cuitEmpleadoReceptor) {
//        Pedido pedidoEncontrado = pedidoRepository.buscarPedidoPorNumero(numero);
//        if (pedidoEncontrado != null) {
//            pedidoRepository.enviarAEntrega(numero, cuitEmpleadoReceptor);
//        }
//    }
//
//    public void entregarPedido(String numero, List<Integer> calificacionesProveedor) {
//        Pedido pedidoEncontrado = pedidoRepository.buscarPedidoPorNumero(numero);
//        if (pedidoEncontrado != null) {
//            pedidoRepository.entregarPedido(numero, calificacionesProveedor);
//        }
//    }
//
//
//    public void transitarPedido(String numero){
//        pedidoRepository.transitarPedido(numero);
//    }
//
//    public int obtenerCantidadPedidosPorSucursal(String codigoSucursal) {
//        return pedidoRepository.obtenerCantidadPedidosPorSucursal(codigoSucursal);
//    }
//    public int contarPedidosEnEstadoPendiente(){
//        return pedidoRepository.contarPedidosEnEstadoPendiente();
//    }


}


