package br.com.alura.mvc.mudi.interceptor;

import net.bytebuddy.asm.Advice;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class InterceptadorDeAcessos extends HandlerInterceptorAdapter {

    public static List<Acesso> acessos = new ArrayList<Acesso>();
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Acesso acesso = new Acesso();
        acesso.path = request.getRequestURI();
        acesso.data = LocalDate.now();

        request.setAttribute("acesso", acesso);
        return true;
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        Acesso acesso = (Acesso)request.getAttribute("acesso");
        acesso.duracao = Duration.between(acesso.data, LocalDate.now());
        acessos.add(acesso);
    }

    public static class Acesso{
        private String path;
        private LocalDate data;
        private Duration duracao;

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public LocalDate getData() {
            return data;
        }

        public void setData(LocalDate data) {
            this.data = data;
        }

        public Duration getDuracao() {
            return duracao;
        }

        public void setDuracao(Duration duracao) {
            this.duracao = duracao;
        }
    }
}
