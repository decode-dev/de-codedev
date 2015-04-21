using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Security.Cryptography;


namespace Test_Security
{
    public partial class MD5_Converter : Form
    {
        public MD5_Converter()
        {
            InitializeComponent();
        }
       

        private void cnvt_btn_Click(object sender, EventArgs e)
        {

            using (MD5 md5Hash = MD5.Create())
            {
                string hash = GetMd5Hash(md5Hash, txt_tb.Text.ToString());
                cnvtxt_tb.Text="The MD5 hash of " + txt_tb.Text.ToString() + " is: " + "\r\n" + hash + ".";
                //vry_btn.Visible = true;
                MessageBox.Show("Verifying the hash...");

                if (VerifyMd5Hash(md5Hash, txt_tb.Text.ToString(), hash))
                {
                    MessageBox.Show("The hashes are the same.", "Valid", MessageBoxButtons.OK, MessageBoxIcon.Information);
                }
                else
                {
                    MessageBox.Show("The Hashes are not same.", "Wrong", MessageBoxButtons.OK, MessageBoxIcon.Error);
                }
            }
        }
        static string GetMd5Hash(MD5 md5Hash, string input)
        {
            // Convert the input string to a byte array and compute the hash. 
            byte[] data = md5Hash.ComputeHash(Encoding.UTF8.GetBytes(input));
            StringBuilder sBuilder = new StringBuilder();
            for (int i = 0; i < data.Length; i++)
            {
                sBuilder.Append(data[i].ToString("x2"));
                
            }
            // Return the hexadecimal string.
            
            return sBuilder.ToString();
         
        }

        // Verify a hash against a string. 
        static bool VerifyMd5Hash(MD5 md5Hash, string input, string hash)
        {

            string hashOfInput = GetMd5Hash(md5Hash, input);

            StringComparer comparer = StringComparer.OrdinalIgnoreCase;
            if (0 == comparer.Compare(hashOfInput, hash))
            {
                return true;
            }
            else
            {
                return false;
            }
        }
    }
}
