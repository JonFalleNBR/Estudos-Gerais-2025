using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SistemaFuncionarioPOO
{
    interface ILogin
    {


        bool FazerLogin(string usuario, string senha);
        void Logout();
        bool IsLoggedIn();
        string GetUserName();
        string GetPassword();



    }
}
