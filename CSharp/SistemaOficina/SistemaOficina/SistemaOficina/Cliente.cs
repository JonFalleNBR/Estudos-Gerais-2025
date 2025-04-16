using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaOficina
{
     public class Cliente
    {

        public string Nome { get; set; }
        public string Email { get; set; }
        public string Telefone { get; set; }


        public override string ToString()
        {
          
            return $"{Nome, -20} | {Email, -25} | {Telefone, -15}";
        }


    }
}
