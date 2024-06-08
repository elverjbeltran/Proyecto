package com.example.app.Controller;




import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.app.Repository.AnteproyectosAprobRepository;
import com.example.app.model.Anteproyectos_Aprobados;



@Controller
public class AnteproyectosAprobControlador {
@Autowired
    private  AnteproyectosAprobRepository anteproyectosAprobRepository;

    @GetMapping("/lista_AnteproyectosAprob.html")  
    public String listarAnteproyectosAprob(Model model) {
        List<Anteproyectos_Aprobados> listaAnteproyectosAprob = anteproyectosAprobRepository.findAll();
        model.addAttribute("listaAnteproyectosAprob", listaAnteproyectosAprob);
        return "lista_AnteproyectosAprob"; 
    }

    @GetMapping("/formAnteproyectosAprob.html")
    public String mostrarFormulario(Model model) {
        model.addAttribute("anteproyectosAprob", new Anteproyectos_Aprobados());
        List<Anteproyectos_Aprobados> listaAnteproyectosAprob = anteproyectosAprobRepository.findAll();
        model.addAttribute("listaAnteproyectosAprob", listaAnteproyectosAprob);
        return "formAnteproyectosAprob"; 
    }
    
    @PostMapping("/guardarAnteproyectosAprob")
    public String guardarAnteproyectosAprob(@ModelAttribute Anteproyectos_Aprobados anteproyectosAprob) {
    	anteproyectosAprobRepository.save(anteproyectosAprob);
        return "redirect:/lista_AnteproyectosAprob.html"; 
    }

    @GetMapping("/Anteproyectos_Aprobados/editar/{id}")
    public String modificarAnteproyectosAprob(@PathVariable("id") Integer id, Model model) {
        Optional<Anteproyectos_Aprobados> anteproyectosAprobOptional = anteproyectosAprobRepository.findById(id);
            
        if (anteproyectosAprobOptional.isPresent()) {
            Anteproyectos_Aprobados anteproyectosAprob = anteproyectosAprobOptional.get();
            model.addAttribute("anteproyectosAprob", anteproyectosAprob);
        } else {
            // Manejar el caso en el que no se encuentre ningún objeto con el ID especificado
            // Aquí puedes redirigir a la lista de anteproyectos o mostrar un mensaje de error
        }
            
        List<Anteproyectos_Aprobados> listaAnteproyectosAprob = anteproyectosAprobRepository.findAll();
        model.addAttribute("listaAnteproyectosAprob", listaAnteproyectosAprob);
            
        return "formAnteproyectosAprob";
    }


    @GetMapping("/Anteproyectos_Aprobados/eliminar/{id}")
	public String eliminarAnteproyectosAprob(@PathVariable("id") Integer id, Model model) {
    	anteproyectosAprobRepository.deleteById(id);
		return "redirect:/lista_AnteproyectosAprob.html";
	}
	
	@GetMapping("/Anteproyectos_Aprobados/inicio")
	public String Inicio() {
		return "index.html";
	}
}

