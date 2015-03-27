namespace MJ_Test
{
    partial class MultiX
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.lbl1 = new System.Windows.Forms.Label();
            this.mulbn = new System.Windows.Forms.Button();
            this.notb = new System.Windows.Forms.TextBox();
            this.lbl2 = new System.Windows.Forms.Label();
            this.rngtb = new System.Windows.Forms.TextBox();
            this.multb = new System.Windows.Forms.TextBox();
            this.nxt_btn = new System.Windows.Forms.Button();
            this.SuspendLayout();
            // 
            // lbl1
            // 
            this.lbl1.AutoSize = true;
            this.lbl1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.lbl1.Location = new System.Drawing.Point(37, 17);
            this.lbl1.Name = "lbl1";
            this.lbl1.Size = new System.Drawing.Size(81, 25);
            this.lbl1.TabIndex = 0;
            this.lbl1.Text = "Number";
            // 
            // mulbn
            // 
            this.mulbn.Font = new System.Drawing.Font("Moire", 16.2F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.mulbn.Location = new System.Drawing.Point(708, 40);
            this.mulbn.Name = "mulbn";
            this.mulbn.Size = new System.Drawing.Size(124, 43);
            this.mulbn.TabIndex = 1;
            this.mulbn.Text = "MX";
            this.mulbn.UseVisualStyleBackColor = true;
            this.mulbn.Click += new System.EventHandler(this.mulbn_Click);
            // 
            // notb
            // 
            this.notb.Location = new System.Drawing.Point(165, 12);
            this.notb.Name = "notb";
            this.notb.Size = new System.Drawing.Size(100, 22);
            this.notb.TabIndex = 2;
            // 
            // lbl2
            // 
            this.lbl2.AutoSize = true;
            this.lbl2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.lbl2.Location = new System.Drawing.Point(37, 90);
            this.lbl2.Name = "lbl2";
            this.lbl2.Size = new System.Drawing.Size(69, 25);
            this.lbl2.TabIndex = 4;
            this.lbl2.Text = "Range";
            // 
            // rngtb
            // 
            this.rngtb.Location = new System.Drawing.Point(165, 90);
            this.rngtb.Name = "rngtb";
            this.rngtb.Size = new System.Drawing.Size(100, 22);
            this.rngtb.TabIndex = 5;
            // 
            // multb
            // 
            this.multb.Location = new System.Drawing.Point(42, 192);
            this.multb.Multiline = true;
            this.multb.Name = "multb";
            this.multb.ScrollBars = System.Windows.Forms.ScrollBars.Vertical;
            this.multb.Size = new System.Drawing.Size(836, 250);
            this.multb.TabIndex = 6;
            // 
            // nxt_btn
            // 
            this.nxt_btn.Font = new System.Drawing.Font("Microsoft Sans Serif", 16.2F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.nxt_btn.Location = new System.Drawing.Point(804, 448);
            this.nxt_btn.Name = "nxt_btn";
            this.nxt_btn.Size = new System.Drawing.Size(39, 43);
            this.nxt_btn.TabIndex = 7;
            this.nxt_btn.Text = ">";
            this.nxt_btn.UseVisualStyleBackColor = true;
            this.nxt_btn.Click += new System.EventHandler(this.button1_Click);
            // 
            // MultiX
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(935, 503);
            this.Controls.Add(this.nxt_btn);
            this.Controls.Add(this.multb);
            this.Controls.Add(this.rngtb);
            this.Controls.Add(this.lbl2);
            this.Controls.Add(this.notb);
            this.Controls.Add(this.mulbn);
            this.Controls.Add(this.lbl1);
            this.Name = "MultiX";
            this.Text = "MultiX";
            this.Load += new System.EventHandler(this.MultiX_Load);
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label lbl1;
        private System.Windows.Forms.Button mulbn;
        private System.Windows.Forms.TextBox notb;
        private System.Windows.Forms.Label lbl2;
        private System.Windows.Forms.TextBox rngtb;
        private System.Windows.Forms.TextBox multb;
        private System.Windows.Forms.Button nxt_btn;
    }
}