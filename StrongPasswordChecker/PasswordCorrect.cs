using System.Linq;

namespace StrongPasswordChecker
{
    class PasswordCorrect
    {
        public int nr = 0;
        public int nrRepetitii = 0;
        public int nrDeSters = 0;
        public int PasswordCheck(string pass)
        {
            if (pass.Length < 6) //conditions for a password that have lower than 6 characters
            {
                if (pass.Length < 3)
                {
                    return nr += (6 - pass.Length);
                }

                if (pass.Length == 3)
                {
                    if (pass[0] == pass[1] && pass[1] == pass[2]) return 4;
                    else return 3;
                }
                else if (pass.Length == 4)
                {
                    if ((pass[0] == pass[1] && pass[1] == pass[2]) || pass[1] == pass[2] && pass[2] == pass[3]) return 3;
                    else if (!pass.Any(char.IsDigit) && !pass.All(char.IsLower) && !pass.Any(char.IsUpper)) return 3;
                    else return 2;
                }
                else
                {
                    if (!pass.Any(char.IsDigit) && !pass.Any(char.IsLower) && !pass.Any(char.IsUpper)) return 3;
                    else if (pass.Any(char.IsUpper) && pass.Any(char.IsLower) && pass.Any(char.IsDigit)) if (pass[0] != pass[1] && pass[1] != pass[2] || pass[1] == pass[2] && pass[2] == pass[3] || pass[2] == pass[3] && pass[3] == pass[4]) return 1;
                        else return 2;
                    else return 2;
                }
            }
            for (int i = 0; i < pass.Length - 2; i++) // verify how many group of repeated characters are in string 
            {
                if (pass[i] == pass[i + 1] && pass[i + 1] == pass[i + 2])
                {

                    if (i < pass.Length - 3) if (pass[i] == pass[i + 1] && pass[i + 1] == pass[i + 2] && pass[i + 2] == pass[i + 3]) 
                    {
                            if (i < pass.Length - 4) { if (pass[i] == pass[i + 1] && pass[i + 1] == pass[i + 2] && pass[i + 2] == pass[i + 3] && pass[i + 3] == pass[i + 4])
                                {
                                    nrRepetitii++;
                                    i += 2;
                                }
                            }
                            else
                            {
                                nrRepetitii++;
                                i += 2;
                            }
                    }
                    else
                    {
                        nrRepetitii++;
                    }
                    else
                    {
                        nrRepetitii++;
                    }
                }
            }
            if (pass.Length > 20) // conditions for the password that have more than 20 characters
            {
                nrDeSters = pass.Length - 20;
                if (nrRepetitii > nrDeSters) if (nrRepetitii >= nrDeSters + 3) return nrRepetitii;
                    else if (nrRepetitii >= nrDeSters + 2 && !pass.Any(char.IsUpper) && !pass.Any(char.IsLower) && !pass.Any(char.IsDigit)) return nrRepetitii + 1;
                    else if ((!pass.Any(char.IsUpper) && !pass.Any(char.IsLower)) || (!pass.Any(char.IsDigit) && !pass.Any(char.IsLower)) || (!pass.Any(char.IsDigit) && !pass.Any(char.IsUpper))) return nrRepetitii;
                    else if ((nrRepetitii >= nrDeSters + 1) && (!pass.Any(char.IsUpper) && !pass.Any(char.IsLower) && !pass.Any(char.IsDigit))) return nrDeSters + 2;
                    else if ((!pass.Any(char.IsUpper) && !pass.Any(char.IsDigit)) || (!pass.Any(char.IsLower) && !pass.Any(char.IsUpper)) || (!pass.Any(char.IsDigit) && !pass.Any(char.IsLower))) return nrRepetitii + 1;
                    else return nrRepetitii;
                else if (nrRepetitii < nrDeSters && !pass.Any(char.IsUpper) && !pass.Any(char.IsLower) && !pass.Any(char.IsDigit)) return nrDeSters + 3;
                else if ((!pass.Any(char.IsUpper) && !pass.Any(char.IsLower)) || (!pass.Any(char.IsDigit) && !pass.Any(char.IsLower)) || (!pass.Any(char.IsDigit) && !pass.Any(char.IsLower))) return nrDeSters + 2;
                else return nrDeSters + 3;
            }
            if (nrRepetitii > 0) // conditions if we have group of repeated characters and missing characters
            {
                if (nrRepetitii == 1)
                {
                    if ((!pass.Any(char.IsUpper) && !pass.Any(char.IsLower)) || (!pass.Any(char.IsLower) && !pass.Any(char.IsDigit)) || (!pass.Any(char.IsDigit) && !pass.Any(char.IsUpper))) return 2;
                    if (!pass.Any(char.IsUpper) && !pass.Any(char.IsLower) && !pass.Any(char.IsDigit)) return 3;

                    return 1;
                }
                else if (nrRepetitii == 2)
                {
                    if (!pass.Any(char.IsUpper) && !pass.Any(char.IsLower) && !pass.Any(char.IsDigit)) return 3;
                    return 2;
                }
                else
                {
                    return nrRepetitii;
                }
            }
            if (!pass.Any(char.IsDigit)) nr++;//see if there are at least one digit
            if (!pass.Any(char.IsLower)) nr++;//see if there are at least one lowercase letter
            if (!pass.Any(char.IsDigit)) nr++;//see if there are at least one uppercase letter
            return nr+nrRepetitii;
        }
    }
}
