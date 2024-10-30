package org.colivera.transaccionescrud.controllers;

import org.colivera.transaccionescrud.aplication.Business.*;
import org.colivera.transaccionescrud.aplication.contracts.services.IListarTransaccionService;
import org.colivera.transaccionescrud.domain.model.TransaccionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/transaccion")
public class TransaccionController {

    @Autowired
    private BuscarTransaccionService buscarTransaccionService;

    @Autowired
    private CrearTransaccionService crearTransaccionService;

    @Autowired
    private ListarTransaccionService listarTransaccionService;

    @Autowired
    private EditarTransaccionService editarTransaccionService;

    @Autowired
    private EliminarTransaccionService eliminarTransaccionService;

    @GetMapping("/crud")
    public ModelAndView welcome(@Param("mensaje") String mensaje){
        List<TransaccionModel> transacciones = listarTransaccionService.listarTransacciones();
        return new ModelAndView("crud").addObject("transacciones", transacciones)
                .addObject("mensaje",mensaje);
    }

    @GetMapping("/editar/{codigo}")
    public ModelAndView actualizar(@PathVariable(name = "codigo") Integer codigo){

        TransaccionModel  transaccionModel = buscarTransaccionService.buscarTransaccion(codigo);

        return new ModelAndView("registrar").addObject("transaccion", transaccionModel);
    }

    @GetMapping("/registrar")
    public ModelAndView registrar(){
        return new ModelAndView("registrar").addObject("transaccion",new TransaccionModel());
    }

    @PostMapping("/guardar")
    public String guardar(TransaccionModel transaccionModel){
        System.out.println(transaccionModel.getCodigo());
        if(transaccionModel.getCodigo() != null){
            editarTransaccionService.editarTransaccion(transaccionModel);
            return "redirect:/transaccion/crud?mensaje=Transaccion actualizada";
        }else {
            crearTransaccionService.crearTransaccion(transaccionModel);
            return "redirect:/transaccion/crud?mensaje=Transaccion guardada";
        }

    }

    @PostMapping("/eliminar/{codigo}")
    public String eliminar(@PathVariable(name = "codigo") Integer codigo){

        eliminarTransaccionService.eliminarTransaccion(codigo);

        return "redirect:/transaccion/crud?mensaje=Transaccion borrada";
    }






}
